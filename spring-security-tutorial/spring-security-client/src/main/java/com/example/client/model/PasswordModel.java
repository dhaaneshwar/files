package com.example.client.model;

import javax.persistence.Entity;

import lombok.Data;


@Data
public class PasswordModel {
	
	private String email;
	private String oldPassword;
	private String newPassword;

}
