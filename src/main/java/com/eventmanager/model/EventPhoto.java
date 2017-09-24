package com.eventmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_photos")
public class EventPhoto {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "path")
	private String path;

	@Column(name = "priority")
	private boolean priority;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;

	public EventPhoto() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
