package com.senao.vo;

public class Schedule {
	
	private String ext;
	
	private String interval;
	
	private String time;

	public String getExt() {
		return ext;
	}

	public String getInterval() {
		return interval;
	}

	public String getTime() {
		return time;
	}
	
	public Schedule(){
		
	}
	
	public Schedule(String ext, String time, String interval) {
		super();
		this.ext = ext;
		this.interval = interval;
		this.time = time;
	}
	
	
}
