package com.hand.even;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler 
implements ApplicationListener<ContextStartedEvent>{
public void onApplicationEvent(ContextStartedEvent event) {
   System.out.println("Context Star");
}
}