package com.senao.vo;

public class Config {
	
	private String connectionString;
	
	private String destination;
	
	private String dir;
	
	private String ext;
	
	private String handler;
	
	private String location;
	
	private Boolean remove;
	
	private Boolean subDirectory;
	
	private String unit;

	public String getConnectionString() {
		return connectionString;
	}

	public String getDestination() {
		return destination;
	}

	public String getDir() {
		return dir;
	}

	public String getExt() {
		return ext;
	}

	public String getHandler() {
		return handler;
	}

	public String getLocation() {
		return location;
	}

	public Boolean getRemove() {
		return remove;
	}

	public Boolean getSubDirectory() {
		return subDirectory;
	}

	public String getUnit() {
		return unit;
	}
	
	public Config(){
	}
	
	public Config(String ext, String location, Boolean subDirectory,
			String unit, Boolean remove, String handler,
			String destination, String dir, String connectionString){
		super();
		this.connectionString = connectionString;
		this.destination = destination;
		this.dir = dir;
		this.ext = ext;
		this.location = location;
		this.remove = remove;
		this.subDirectory = subDirectory;
		this.unit = unit;
		this.handler = handler;
	}
	
}
