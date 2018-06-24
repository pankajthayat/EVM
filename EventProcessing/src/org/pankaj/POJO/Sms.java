package org.pankaj.POJO;

public class Sms {
private String sms;
private String sender;
private String eventStartTime;
private String numberOfChars;
private String reciever;
public Sms(String sms, String sender, String eventStartTime, String numberOfChars, String reciever) {
	super();
	this.sms = sms;
	this.sender = sender;
	this.eventStartTime = eventStartTime;
	this.numberOfChars = numberOfChars;
	this.reciever = reciever;
}
public String getSms() {
	return sms;
}
public void setSms(String sms) {
	this.sms = sms;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public String getEventStartTime() {
	return eventStartTime;
}
public void setEventStartTime(String eventStartTime) {
	this.eventStartTime = eventStartTime;
}
public String getNumberOfChars() {
	return numberOfChars;
}
public void setNumberOfChars(String numberOfChars) {
	this.numberOfChars = numberOfChars;
}
public String getReciever() {
	return reciever;
}
public void setReciever(String reciever) {
	this.reciever = reciever;
}


}
