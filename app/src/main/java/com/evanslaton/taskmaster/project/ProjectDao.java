package com.evanslaton.taskmaster.project;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ProjectDao {
    // Inserts a project into the database
    @Insert
    void insertExercise(Project project);

    // Gets the project with the inputted id from the database
    @Query("SELECT * FROM project WHERE id=:id")
    Project getById(long id);

    // Gets all the projects from the database
    @Query("SELECT * FROM project")
    List<Project> getAll();
}
