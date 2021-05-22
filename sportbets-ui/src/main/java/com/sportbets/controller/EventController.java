package com.sportbets.controller;

import com.sportbets.enity.Event;
import com.sportbets.service.EventService;

public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    public void save (Event event){
        eventService.save(event);
    }
}
