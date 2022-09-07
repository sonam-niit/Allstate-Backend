package com.allstate.eventhandling.custom;

import org.springframework.context.ApplicationEvent;

public class CustomeEvent extends ApplicationEvent{

	public CustomeEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "This is the message from CustomeEvent";
	}

	
}
