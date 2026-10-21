package data;

import model.Exercise;
import model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class DemoData {
    public static List<Trainer> trainers = new ArrayList<>();
    public static List<Exercise> exercises = new ArrayList<>();

    static{
        Trainer t1 = new Trainer(1L,"Kenan",5,"Kardio trening");
        Trainer t2 = new Trainer(2L,"Hamza",3,"Snaga i kondicija");

        Exercise e1 = new Exercise(100L,"Sprint na traci","Kardio",t1);
        Exercise e2 = new Exercise(101L,"Bench klupa","Snaga",t2);
        Exercise e3 = new Exercise(102L,"Cucanj sa sipkom","Snaga",t1);
        Exercise e4 = new Exercise(104L,"Preskakanje konopca","Kardio",t2);

        t1.getExercises().add(e1);
        t1.getExercises().add(e3);
        t2.getExercises().add(e2);
        t2.getExercises().add(e4);

        trainers.add(t1);
        trainers.add(t2);

        exercises.add(e1);
        exercises.add(e2);
        exercises.add(e3);
        exercises.add(e4);

    }
}
