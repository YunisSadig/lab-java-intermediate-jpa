package com.example.demo.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class InternalTask extends Tasks {
    public InternalTask(){}
    public InternalTask(String title, LocalDate due, boolean status) {
        super(title, due, status);
    }
}
