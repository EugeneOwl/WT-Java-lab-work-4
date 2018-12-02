package com.hotel.eugene.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room extends BaseEntity {

    @Column
    private int number;

    @ManyToOne
    private User bookedBy;

    public Room() {
    }

    public Room(int number, User bookedBy) {
        this.number = number;
        this.bookedBy = bookedBy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }
}
