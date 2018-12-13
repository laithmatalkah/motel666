package com.example.motel666.motel666laith.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Event {

    @Id
    private Long id;
    @Column
    private String userId;


    @Column
    private String type;

    @Column
    private Long timeStamp;

    @Column
    private String context;


    public Event(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event(Long id, String userId, String type, Long timeStamp, String context) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.timeStamp = timeStamp;
        this.context = context;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
