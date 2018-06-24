package org.pankaj.POJO;

public class RejectedEvent {
	private String eventType;
	private String targetResources;
	private String eventStartTime;
	private String eventUnitConsumed;
	private String rejectionReason;
	public RejectedEvent(String eventType, String targetResources, String eventStartTime, String eventUnitConsumed,
			String rejectionReason) {
		super();
		this.eventType = eventType;
		this.targetResources = targetResources;
		this.eventStartTime = eventStartTime;
		this.eventUnitConsumed = eventUnitConsumed;
		this.rejectionReason = rejectionReason;
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
	public String getRejectionReason() {
		return rejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}
	
}
