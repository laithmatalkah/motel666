package com.example.motel666.motel666laith.dataservice;

import com.example.motel666.motel666laith.model.Event;
import com.example.motel666.motel666laith.repository.EventRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;





@Service
public class EventServices {

    private final EventRepo eventRepo;

    public EventServices(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public List<Event> getEventsByTime (Long startTime, Long endTime){ return (List)eventRepo.findbyTime(startTime,endTime);}

    public List<Event> getEventsByUser (String userId){ return (List)eventRepo.findById(userId).get();}



}
