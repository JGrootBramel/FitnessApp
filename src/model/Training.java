package model;

import java.time.LocalDateTime;
import java.time.LocalDate;




public class Training {

    private String name;
    private LocalDate startDate;
    private LocalDateTime startTime;
    private int day, month, year;
    private int startHour, startMinute;
    private int loadtime;
    private String[] exercises;

    public Training (String name, int day, int month, int year, int startHour, int startMinute, int loadtime, String[] exercises) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.startMinute = startMinute;
        this.startHour = startHour;
        this.loadtime = loadtime;
        this.exercises = exercises;
    }

    public void Train () {
        loadtime++;
    }

    public void Train (int minutes){
        loadtime += 5;
//        loadtime += minutes;
    }








































































































































    public Training (LocalDate startDate, LocalDateTime startTime) {
        this.startDate = startDate;
        this.startTime = startTime;
    }

    public void ausgabe (){
        System.out.println("Dein Training startete jetzt um " + startTime);
    }

    //Liste mit absolvierten Exercises addirt Zeit und verbrannte Kalorien


}
