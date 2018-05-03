import model.Exercise;
import model.Mashine;
import model.Musclegroup;

public class App {

    public static void main (String args[]) {

        System.out.println("Fitnessapp gestartet!");

        //Objekte MGroup erzeugen und Muskeln in Array festlegen
        System.out.println("\n Muskelgruppen werden inizialisiert.");
        Musclegroup ruecken = new Musclegroup("Rücken", new String[] {"Latissimus","Trapezius","Rückenstrecker"});
        Musclegroup schultern = new Musclegroup("Schultern", new String[] {"Delta Muskel","kleiner Rundmuskel","großer Rundmuskel", "Unterschulterblattmuskel", "Obergrätenmuskel", "Untergrätenmuskel"});
        Musclegroup brust = new Musclegroup("Brust", new String[] {"Oberer Brustmuskel","Mittlerer Brustmuskel","Unterer Brustmuskel","Sägemuskel"});
        Musclegroup beine = new Musclegroup ("Beine", new String[] {"Quadrizeps","Beinbizeps","Gesäß","Waden"});
        Musclegroup arme = new Musclegroup("Arme", new String[] {"Bizeps", "Trizeps","Unterarmmuskeln"});
        Musclegroup bauch = new Musclegroup("Bauch", new String[] {"Oberer Bauchmuskeln","Untere Bauchmuskeln","Seitliche Bauchmuskeln"});

        //Geraete erzeugen
        System.out.println("\n Geräte werden erzeugt");
        Mashine laufband = new Mashine("Laufband","Cardio", beine, 300, 30, true);
        Mashine langhantel = new Mashine("Langhantel", "Freihantel", ruecken, 5, 50, false);
        Mashine schultertrainer = new Mashine("Schultertrainer", schultern, 5 ,500, false);
        Mashine ergometer = new Mashine("Ergometer", "Cardio", ruecken, 60, 45, false);




        //Übungen erzeugen
        System.out.println("\nÜbungen werden erzeugt");
        Exercise joggen = new Exercise("Joggen", laufband, new Musclegroup[] {beine, bauch} , "03.05.18", 13 ,42);
        joggen.setMinutes(10);

        Exercise latzug = new Exercise("Latzug", langhantel,  new Musclegroup[] {ruecken, arme}, "02.05.18", 14 , 00);
        latzug.setMinutes(1);

        Exercise rudern = new Exercise("Rudern", ergometer, new Musclegroup[] {ruecken, arme, beine, bauch, schultern}, "02.05.18", 14, 15);
        rudern.setMinutes(10);

        //Exercise Methoden
/*        System.out.println("\nExercise Methoden");
        joggen.calGoal(300);
        rudern.calGoal(10000);

        joggen.timeNessesary(300);
        joggen.timeNessesary(10000);

        joggen.train();
        rudern.train(25);

        //Mashine Methoden
        System.out.println("\nMashine Methoden");
        laufband.burnedCals(30);
        laufband.burnedCals(2, 5);

        System.out.println(laufband.averageCalsPerH());
        System.out.println(ergometer.trainsMGroup(ruecken));
        System.out.println(ergometer.trainsMGroup(arme));
        System.out.println(ergometer.trainsMuscle("Latissimus"));
        System.out.println(laufband.trainsMuscle("Latissimus"));

        laufband.benoetigtStromversorgung();
        langhantel.benoetigtStromversorgung();

        //Muskelgruppen methoden
        System.out.println("\nMuskelgruppen Methoden");
        System.out.println(ruecken.containsMuscle("Latissimus"));
        System.out.println(ruecken.containsMuscle("Biezeps"));
*/

        Exercise schulterheben = new Exercise("Schulterheben", schultertrainer, new Musclegroup[]{schultern}, "03.05.18", 15,47);
        schulterheben.setMinutes(10);


        System.out.println("AverageCalsPerMinute: " + schulterheben.getMashine().averageCalsPerH()/60);
        while (!schulterheben.calGoal(1200)){
            schulterheben.train(1);
//            System.out.println("Neue Trainingsdauer " + schulterheben.getMinutes());
        }
//        schulterheben.getMashine().burnedCals(schulterheben.getMinutes());
        System.out.println("Trainierte Minuten: " + schulterheben.getMinutes());
        System.out.println("Verbrannte Kalorien: " + schulterheben.getMashine().burnedCals(schulterheben.getMinutes()));
    }
}

// Trainingsplan erstellen je nach TrainingsZiel mit den jeweiligen Wiederholungen und Sätzen
// Zufällig oder mit Empfehlungen nach eingabe von Ziel und Art (Statisch/Pyramiede