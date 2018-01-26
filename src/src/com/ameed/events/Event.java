package com.ameed.events;

import java.time.LocalDate;

public class Event {
	private String description;
	private LocalDate startDate;
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "[description=" + description + ", startDate=" + startDate + ", id=" + id + "]";
	}

}
