package com.hotel.eugene.service.impl;

import com.hotel.eugene.entity.Room;
import com.hotel.eugene.repository.RoomRepository;
import com.hotel.eugene.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    @Override
    public List<Room> getAll() {
        return repository.findAll();
    }
}
