package com.hotel.eugene.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String username;

    @Enumerated(EnumType.STRING)
    @Column
    private UserRole role;

    @JsonIgnore
    @OneToMany(mappedBy = "bookedBy")
    private List<Room> bookedRooms = new ArrayList<>();

    public User() {
    }

    public User(String username, UserRole role, List<Room> bookedRooms) {
        this.username = username;
        this.role = role;
        this.bookedRooms = bookedRooms;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Room> getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(List<Room> bookedRooms) {
        this.bookedRooms = bookedRooms;
    }
}
