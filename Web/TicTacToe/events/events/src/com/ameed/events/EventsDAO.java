package com.ameed.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EventsDAO {

	private static List<Event> events = new ArrayList<>();
	private static int nextId = 1000;

	public static List<Event> listAll() {
		return events;
	}

	public static Event insert(Event newEvent) {
		newEvent.setId(nextId++);
		events.add(newEvent);
		return newEvent;
	}

	public static Event delete(int eventId) {
		Optional<Event> eventToDelete = events.stream()
				.filter(a -> eventId == a.getId())
				.findFirst();
		if (eventToDelete.isPresent()) {
			Event event = eventToDelete.get();
			events.remove(event);
			return event;
		}
		return null;
	}

}
