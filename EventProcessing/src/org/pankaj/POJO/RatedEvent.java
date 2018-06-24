package org.pankaj.POJO;

public class RatedEvent {
private String eventType;
private String targetResources;
private String eventStartTime;
private String eventUnitConsumed;
private String totalCharge;
public RatedEvent(String eventType, String targetResources, String eventStartTime, String eventUnitConsumed,
		String totalCharge) {
	super();
	this.eventType = eventType;
	this.targetResources = targetResources;
	this.eventStartTime = eventStartTime;
	this.eventUnitConsumed = eventUnitConsumed;
	this.totalCharge = totalCharge;
}
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getTargetResources() {
	return targetResources;
}
public void setTargetResources(String targetResources) {
	this.targetResources = targetResources;
}
public String getEventStartTime() {
	return eventStartTime;
}
public void setEventStartTime(String eventStartTime) {
	this.eventStartTime = eventStartTime;
}
public String getEventUnitConsumed() {
	return eventUnitConsumed;
}
public void setEventUnitConsumed(String eventUnitConsumed) {
	this.eventUnitConsumed = eventUnitConsumed;
}
public String getTotalCharge() {
	return totalCharge;
}
public void setTotalCharge(String totalCharge) {
	this.totalCharge = totalCharge;
}

}
