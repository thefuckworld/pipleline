package com.dw.pipleline;

public enum RoutingEnum {

	ONEDAYROUTING("oneDay.eatRiceNode", "一天的行程");
	
	private String name;
	private String desc;
	
	private RoutingEnum(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
