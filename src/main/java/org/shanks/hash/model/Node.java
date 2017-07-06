package org.shanks.hash.model;

import java.time.LocalTime;

import org.shanks.hash.handler.Handler;

import lombok.Data;

@Data
public class Node {

	private LocalTime localTime;
	
	private Handler handler;
	
	public Node() {
		
	}
	
	public Node(int hour, int min, Handler handler) {
		this.localTime = LocalTime.of(hour, min);
		this.handler = handler;
	}
}
