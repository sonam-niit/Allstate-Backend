package com.allstate.eventhandling.custom;

import org.springframework.context.ApplicationListener;

public class CustomEventlistener implements ApplicationListener<CustomeEvent>{

	public void onApplicationEvent(CustomeEvent event) {
		System.out.println(event);
	}

	
}
