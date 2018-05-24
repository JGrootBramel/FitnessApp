package model;

import java.util.ArrayList;

public class TrainingProgram
        implements TrainingAim {

    private int calAim = 0;
    private ArrayList<Exercise> Exercises = new ArrayList<>();

    public void addExercise(Exercise exercise){
        Exercises.add(exercise);
    }

    public int totalCaloriesBurned(){
        int totalCaloriesBurned = 0;
        for (Exercise e: Exercises) {
            totalCaloriesBurned += e.burnedCals();
        }

        /*for (int i=0; i<Exercises.size(); i++){
            totalCaloriesBurned += Exercises.get(i).burnedCals();
        }*/
        return totalCaloriesBurned;
    }

    public int getTotalMinutes (){
        int totalMinutes = 0;
        for (Exercise e: Exercises) {
            totalMinutes += e.getMinutes();
        }
        return totalMinutes;
    }

    public int getTotalMinutesTrainedAtMashine(String mashine){
        int totalMinutes = 0;
        for (Exercise e: Exercises) {
            if (e.getMashine().getName().equals(mashine)){
                totalMinutes += e.getMinutes();
            }
        }
        return totalMinutes;
    }

    public void setCalAim(int calAim) {
        this.calAim = calAim;
    }
    public int getCalAim (){
        return calAim;
    }


    public double getDegree(){
        double degree = (int)(totalCaloriesBurned()*10000.0/calAim)/100.0;
        return degree;
    }

}
