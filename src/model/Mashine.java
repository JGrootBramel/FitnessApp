package model;

import java.util.Arrays;

//Trainingsgerät

public class Mashine {

    private String name;
    private String type;
    private Musclegroup musclegroup;

    private boolean electric;
    private int calsPerMinute;
    private int maxTime;
    private int avergeCalsPerH = calsPerMinute * 60;

    public int getCalsPerMinute() {
        return calsPerMinute;
    }
    private String[] types = {"Cardio","Freihantel","Kabelzug","Gerät mit festen Gewichten","Gerät mit losen Gewichten," +
            "Gerät für Eigenkörpergewicht"};


    public Mashine(String name, String type, Musclegroup musclegroup, int maxTime, int calsPerMinute, boolean electric) {
        this.name = name;
        this.maxTime = maxTime;
        this.musclegroup = musclegroup;
        this.calsPerMinute = calsPerMinute;
        this.electric = electric;

        //Validitätscheck für den Gerätetypen
        if (Arrays.asList(types).contains(type)){
            this.type = type;
        } else {
            System.out.println("Der Gerätetype " + type + " ist kein valider Typ");
            System.out.println("Bitte gib einen der folgenden Typen:");
            for (int i = 0; i < types.length; i++) System.out.println(types[i]);
        }
    }

    //Calorienverbrennung nicht linear sondern setzt erst nach 30-45 minuten Training richtig ein. wie bilde ich das richtig ab?
    //nur bei Cardio wirklich ermittelbar ohne Herzschlagmessung...
    public void burnedCalories () {
        System.out.println("In "+ " Sekunden hast du " + " kcal verbrannt");
    }

    public void averageCalsPerH () {
        System.out.println("Die Übung verbrennt durchschnittlich " + avergeCalsPerH + "Kalorien pro Stunde");
    }

    public void benoetigtStromversorgung () {
        if (electric == true){
            System.out.println("Das Gerät: " + name + " benötigt Strom");
        } else {
            System.out.println("Das Gerät: " + name + " benötigt keinen Strom.");
        }
    }

    public boolean trainsMuscle (String trainsMuscle){
        return (Arrays.asList(musclegroup.getMuscles()).contains(trainsMuscle));
    }

    public boolean trainsMuscleGroup (Musclegroup trainsMuscleGroup) {
        return(trainsMuscleGroup.getName().equals(musclegroup.getName()));
    }



    // Muskelgruppe und Muskel
}
