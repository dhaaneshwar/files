package com.example.client.event;

import org.springframework.context.ApplicationEvent;

import com.example.client.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent{
	
	private User user;
	private String appicationUrl;
	
	public RegistrationCompleteEvent(User user,String applicationUrl) {
		super(user);
		this.user=user;
		this.appicationUrl=applicationUrl;
	}

}
