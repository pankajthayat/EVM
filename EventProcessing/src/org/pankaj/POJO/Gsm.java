package org.pankaj.POJO;

public class Gsm {
	private String eventType;
	private String caller;
	private String eventStratTime;
	private String callDuration;
	private String calee;
	public Gsm(String eventType, String caller, String eventStratTime, String callDuration, String calee) {
		
		this.eventType = eventType;
		this.caller = caller;
		this.eventStratTime = eventStratTime;
		this.callDuration = callDuration;
		this.calee = calee;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public String getEventStratTime() {
		return eventStratTime;
	}
	public void setEventStratTime(String eventStratTime) {
		this.eventStratTime = eventStratTime;
	}
	public String getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}
	public String getCalee() {
		return calee;
	}
	public void setCalee(String calee) {
		this.calee = calee;
	}
}
