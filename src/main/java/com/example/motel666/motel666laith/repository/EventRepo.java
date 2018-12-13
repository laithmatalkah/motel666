package com.example.motel666.motel666laith.repository;

import com.example.motel666.motel666laith.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepo  extends CrudRepository <Event,String> {

    @Query ("Select e from Event where e.timeStamp between :s and :e")
    List<Event> findbyTime(Long s,Long e);
}
