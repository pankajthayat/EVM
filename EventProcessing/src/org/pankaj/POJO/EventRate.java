package org.pankaj.POJO;

public class EventRate {
private String eventType;
private String effectiveDate;
private String uom;
private String unitAmount;
private String unitRate;
public EventRate(String eventType, String effectiveDate, String uom, String unitAmount, String unitRate) {
	super();
	this.eventType = eventType;
	this.effectiveDate = effectiveDate;
	this.uom = uom;
	this.unitAmount = unitAmount;
	this.unitRate = unitRate;
}
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getEffectiveDate() {
	return effectiveDate;
}
public void setEffectiveDate(String effectiveDate) {
	this.effectiveDate = effectiveDate;
}
public String getUom() {
	return uom;
}
public void setUom(String uom) {
	this.uom = uom;
}
public String getUnitAmount() {
	return unitAmount;
}
public void setUnitAmount(String unitAmount) {
	this.unitAmount = unitAmount;
}
public String getUnitRate() {
	return unitRate;
}
public void setUnitRate(String unitRate) {
	this.unitRate = unitRate;
}

}
