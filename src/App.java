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


        //Muskelgruppen definieren
        String[] armMuskeln = {"Bizeps", "Trizeps","Unterarmmuskeln"};
        String[] rueckenMuskeln = {"Latissimus","Trapezius","Rückenstrecker"};
        String[] schulterMuskeln = {"Delta Muskel","kleiner Rundmuskel","großer Rundmuskel"};
        String[] brustMuskeln = {"Oberer Brustmuskel","Mittlerer Brustmuskel","Unterer Brustmuskel","Sägemuskel"};
        String[] beinMuskeln = {"Quadrizeps","Beinbizeps","Gesäß","Waden"};
        String[] bauchMuskeln = {"Oberer Bauchmuskeln","Untere Bauchmuskeln","Seitliche Bauchmuskeln"};

        Musclegroup ruecken = new Musclegroup("Rücken", rueckenMuskeln);
        Musclegroup schultern = new Musclegroup("Schultern", schulterMuskeln);
        Musclegroup brust = new Musclegroup("Brust", brustMuskeln);
        Musclegroup beine = new Musclegroup ("Beine", beinMuskeln);
        Musclegroup arme = new Musclegroup("Arme", armMuskeln);
        Musclegroup bauch = new Musclegroup("Bauch", bauchMuskeln);

        Mashine laufband = new Mashine("Laufband","Cardio", beine, 300, 30, true);
        Mashine fahrrad = new Mashine("Fahrrad", "Cardio", beine,360, 45, false);
        Mashine langhantel = new Mashine("Langhantel", "Hypertrophie", ruecken, 5, 50, false);




        Exercise joggen = new Exercise ("Joggen", laufband, 10, 1, 0, 450, beinMuskeln);
        joggen.setMinutes(45);
        Exercise latzug = new Exercise("Latzug", langhantel, 100, 3, 12, 1, rueckenMuskeln);
        latzug.setMinutes(1);
        Exercise ruderzug = new Exercise("Ruderzug", langhantel, 85.5, 3, 12, 1, rueckenMuskeln);
        ruderzug.setMinutes(1);

        start.ausgabe();
        joggen.ausgabe();
        laufband.benoetigtStromversorgung();
        latzug.ausgabe();
        langhantel.benoetigtStromversorgung();
        ruderzug.ausgabe();

        joggen.calGoal(600);
        joggen.timeNessesary(600);

        laufband.trainsMuscleGroup(bauch);
        laufband.trainsMuscleGroup(beine);




    }
}

// Trainingsplan erstellen je nach TrainingsZiel mit den jeweiligen Wiederholungen und Sätzen
// Zufällig oder mit Empfehlungen nach eingabe von Ziel und Art (Statisch/Pyramiede