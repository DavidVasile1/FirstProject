package model.entities;

import jakarta.persistence.*;
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String classScheduleId;

    private String className;

}
