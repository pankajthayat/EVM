package org.pankaj.POJO;

public class Gprs {
private String eventType;
private String targetSource;
private String eventStartTime;
private String dataConsumed;
private String website;
public Gprs(String eventType, String targetSource, String eventStartTime, String dataConsumed, String website) {
	
	this.eventType = eventType;
	this.targetSource = targetSource;
	this.eventStartTime = eventStartTime;
	this.dataConsumed = dataConsumed;
	this.website = website;
}
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getTargetSource() {
	return targetSource;
}
public void setTargetSource(String targetSource) {
	this.targetSource = targetSource;
}
public String getEventStartTime() {
	return eventStartTime;
}
public void setEventStartTime(String eventStartTime) {
	this.eventStartTime = eventStartTime;
}
public String getDataConsumed() {
	return dataConsumed;
}
public void setDataConsumed(String dataConsumed) {
	this.dataConsumed = dataConsumed;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}

}
