package com.allstate.eventhandling.custom;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventpublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}

	public void publish() {
		CustomeEvent ce= new CustomeEvent(this);
		publisher.publishEvent(ce);
	}
}
