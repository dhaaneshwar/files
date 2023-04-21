package com.project.springAnnotationConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Worlds best CPU");

	}

}
