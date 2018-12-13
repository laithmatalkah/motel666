package com.example.motel666.motel666laith.Controllers;


import com.example.motel666.motel666laith.dataservice.EventServices;
import com.example.motel666.motel666laith.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/events")
public class EventController {


        private final EventServices eventServices;

    public EventController(EventServices eventServices) {
        this.eventServices = eventServices;
    }


    @GetMapping("/by-time/{startTime}/{endTime}")
    public List<Event> getBytime(@PathVariable ("startTime") Long startTime, @PathVariable("endTime") Long endTime){

        return eventServices.getEventsByTime(startTime,endTime);


    }


    @GetMapping("/by-user/{userId}")
    public List<Event> getByUser(@PathVariable ("userId") String userId){

        return eventServices.getEventsByUser(userId);
    }
}
