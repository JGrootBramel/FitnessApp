import java.time.LocalDate;
import java.time.LocalDateTime;

import model.Exercise;
import model.Mashine;
import model.Musclegroup;
import model.Training;

public class App {

    public static void main (String args[]) {

        System.out.println("Fitnessapp gestartet!");

        LocalDate startingDate = LocalDate.now();
        LocalDateTime startingTime = LocalDateTime.now();
        Training start = new Training(startingDate, startingTime);

        //Objekte MGroup erzeugen und Muskeln in Array festlegen
        Musclegroup ruecken = new Musclegroup("Rücken", new String[] {"Latissimus","Trapezius","Rückenstrecker"});
        Musclegroup schultern = new Musclegroup("Schultern", new String[] {"Delta Muskel","kleiner Rundmuskel","großer Rundmuskel"});
        Musclegroup brust = new Musclegroup("Brust", new String[] {"Oberer Brustmuskel","Mittlerer Brustmuskel","Unterer Brustmuskel","Sägemuskel"});
        Musclegroup beine = new Musclegroup ("Beine", new String[] {"Quadrizeps","Beinbizeps","Gesäß","Waden"});
        Musclegroup arme = new Musclegroup("Arme", new String[] {"Bizeps", "Trizeps","Unterarmmuskeln"});
        Musclegroup bauch = new Musclegroup("Bauch", new String[] {"Oberer Bauchmuskeln","Untere Bauchmuskeln","Seitliche Bauchmuskeln"});

        //Geraete erzeugen
        Mashine laufband = new Mashine("Laufband","Cardio", beine, 300, 30, true);
        Mashine fahrrad = new Mashine("Fahrrad", "Cardio", beine,360, 40, false);
        Mashine langhantel = new Mashine("Langhantel", "Freihantel", ruecken, 5, 50, false);
        Mashine ergometer = new Mashine("Ergometer", "Cardio", ruecken, 60, 45, false);




        Exercise joggen = new Exercise ("Joggen", laufband, 10, 1, 0, 450, new Musclegroup[] {beine});
        joggen.setMinutes(0);
        Exercise latzug = new Exercise("Latzug", langhantel, 100, 3, 12, 1, new Musclegroup[] {ruecken, arme});
        latzug.setMinutes(1);
        Exercise rudern = new Exercise("Rudern", ergometer, new Musclegroup[] {ruecken, arme, beine, bauch, schultern});
        rudern.setMinutes(20);

        start.ausgabe();
        joggen.ausgabe();
        laufband.benoetigtStromversorgung();
        laufband.burnedCalsPerM(30);
        laufband.burnedCalsPerHM(2,30 );
        laufband.averageCalsPerH();
        latzug.ausgabe();
        langhantel.benoetigtStromversorgung();
        rudern.ausgabe();
        rudern.trainsMuscle("Latissimus");
        ergometer.trainsMuscleGroup(arme);



        joggen.calGoal(600);
        joggen.timeNessesary(600);


        laufband.trainsMuscleGroup(bauch);
        laufband.trainsMuscleGroup(beine);

        while (!joggen.calGoal(800)){
            joggen.Train(5);
        }
        joggen.getMashine().burnedCalsPerM(joggen.getMinutes());




    }
}

// Trainingsplan erstellen je nach TrainingsZiel mit den jeweiligen Wiederholungen und Sätzen
// Zufällig oder mit Empfehlungen nach eingabe von Ziel und Art (Statisch/Pyramiede