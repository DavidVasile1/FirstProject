package org.example.service;

import org.example.model.entities.Classes;

import java.util.UUID;

public interface ClassesService {

    void createClass(Classes classes);
    Classes getClass(UUID id);
    void updateClass(Classes classes);
    void deleteClass(UUID id);

    void getAllClassesFromAGym();

}
