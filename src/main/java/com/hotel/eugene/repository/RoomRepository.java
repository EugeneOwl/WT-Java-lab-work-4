package com.hotel.eugene.repository;

import com.hotel.eugene.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
