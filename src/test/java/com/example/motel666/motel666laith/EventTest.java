package com.example.motel666.motel666laith;


import com.example.motel666.motel666laith.Controllers.EventController;
import com.example.motel666.motel666laith.dataservice.EventServices;
import com.example.motel666.motel666laith.model.Event;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EventTest {


    EventServices eventServicesMock=mock(EventServices.class);

    @Test
    public void getListWithinTimeTest(){


        //setup
        List<Event> expected = new ArrayList<Event>(){{

            add(new Event(1231313L,"12424hjkhj","hjkfrfrhjk", 4672346L,"huewkfwqrwrk"));
            add(new Event(123123123L,"12424hjkhj","hjkfrfrhjk",1789342378234L,"huewkfwqrwrk"));
            add(new Event(23537565L,"12424hjkhj","hjkfrfrhjk",25367811248231L,"huewkfwqrwrk"));
            add(new Event(6734534538L,"12424hjkhj","hjkfrfrhjk",67381245164112L,"huewkfwqrwrk"));

        }};

        EventController eventController=new EventController(eventServicesMock);
        when(eventServicesMock.getEventsByTime(4672346L,67381245164112L)).thenReturn(expected);
        //execute

        List<Event> actual=eventController.getBytime(4672346L,67381245164112L);

        //Assert
        assertEquals(actual,expected);

    }

    @Test
    public void getSingleUserTest(){


        //setup
        List<Event> expected = new ArrayList<Event>(){{

            add(new Event(1231313L,"12424hjkhj","hjkfrfrhjk", 674834672346L,"huewkfwqrwrk"));
            add(new Event(123123123L,"12424hjkhj","hjkfrfrhjk",1789342378234L,"huewkfwqrwrk"));
            add(new Event(23537565L,"12424hjkhj","hjkfrfrhjk",25367811248231L,"huewkfwqrwrk"));
            add(new Event(6734534538L,"12424hjkhj","hjkfrfrhjk",67381245164112L,"huewkfwqrwrk"));

        }};

        EventController eventController=new EventController(eventServicesMock);

        when(eventController.getByUser("12424hjkhj")).thenReturn(expected);


        //execute

        List<Event> actual = eventController.getByUser("12424hjkhj");

        //Assert
        assertEquals(expected,actual);
    }


}
