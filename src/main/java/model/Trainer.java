package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private Long id;
    private String name;
    private int experienceYears;
    private String speciality;
    private List<Exercise> exercises = new ArrayList<>();

    public Trainer(Long id, String name, int experienceYears, String speciality) {
        this.id = id;
        this.name = name;
        this.experienceYears = experienceYears;
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
