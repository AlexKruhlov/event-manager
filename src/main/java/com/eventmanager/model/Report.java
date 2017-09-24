package com.eventmanager.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reports")
public class Report extends AbstractAction {
	
	@OneToOne
	@JoinColumn(name = "speaker_id")
	private Speaker speaker;

	public Report() {
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
}
