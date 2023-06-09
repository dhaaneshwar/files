package com.example.client.event.listener;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.client.entity.User;
import com.example.client.entity.VerificationToken;
import com.example.client.event.RegistrationCompleteEvent;
import com.example.client.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent>{
	
	@Autowired
	private UserService userService;

	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {
		//create the verification token for the user with link
		User user=event.getUser();
		String token=UUID.randomUUID().toString();
		userService.saveVerificationTokenForUser(token,user);
		// send mail to user
		String url=event.getAppicationUrl()+"/verifyRegistration?token="+token;
		
		//send verification mail to email
		log.info("Click the link to verify your account: {}", url);
	}

}
