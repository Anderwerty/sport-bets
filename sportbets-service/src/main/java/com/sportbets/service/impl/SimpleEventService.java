package com.sportbets.service.impl;

import com.sportbets.enity.Event;
import com.sportbets.repository.EventRepository;
import com.sportbets.service.EventService;

public class SimpleEventService implements EventService {

    private final EventRepository eventRepository;

    public SimpleEventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }
}
