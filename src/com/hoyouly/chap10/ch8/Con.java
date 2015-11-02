package com.hoyouly.chap10.ch8;

import java.util.ArrayList;
import java.util.List;


public class Con {


	private List<AAAA> eventList=new ArrayList<AAAA>();
	
	public void addEvent(AAAA event){
		eventList.add(event);
	}
	
	
	public void run(){
		while(eventList.size()>0){
			for (AAAA e : new ArrayList<AAAA>(eventList)) {
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
				
			}
		}
	}
}
