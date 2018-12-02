package com.hotel.eugene.controller;

import com.hotel.eugene.entity.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "hotel/rooms", produces = APPLICATION_JSON_VALUE)
public class RoomController {

    @GetMapping
    public List<Object> getAll() {

        return Collections.singletonList(new Room(19));
    }
}
