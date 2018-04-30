package model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Training {



    LocalDate startDate;
    LocalDateTime startTime;

    public Training (LocalDate startDate, LocalDateTime startTime) {
        this.startDate = startDate;
        this.startTime = startTime;
    }

    public void ausgabe (){
        System.out.println("Dein Training startete jetzt um " + startTime);
    }

    //Liste mit absolvierten Exercises addirt Zeit und verbrannte Kalorien


}
