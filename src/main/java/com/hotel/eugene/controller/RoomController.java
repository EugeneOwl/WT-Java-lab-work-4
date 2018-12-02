package com.hotel.eugene.controller;

import com.hotel.eugene.entity.Room;
import com.hotel.eugene.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "rooms", produces = APPLICATION_JSON_VALUE)
public class RoomController {

    @Autowired
    private RoomService service;

    @GetMapping
    public List<Room> getAll() {
        return service.getAll();
    }
}
