package com.adineh.hw.model;

public enum HWType {

	CPU("CPU"),
	MotherBoard("MotherBoard"),
	RAM("RAM"),
	HDD("HDD"),
	Power("Power");
	
	private final String type;
	
	HWType(String type){
		this.type = type;
	}
	
	public String getHWType() {
		return type;
	}
}
