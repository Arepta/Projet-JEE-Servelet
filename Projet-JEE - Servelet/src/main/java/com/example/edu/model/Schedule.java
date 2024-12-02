
package com.example.edu.model;

import java.io.Serializable;

public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String day;
    private String time;
    private String room;

    public Schedule() {}

    public Schedule(int id, String day, String time, String room) {
        this.id = id;
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
