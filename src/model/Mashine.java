package model;

import java.util.Arrays;

//Trainingsgerät

public class Mashine {

    private String name;
    private String type;
    private Musclegroup musclegroup;
    private int maxTime;
    private boolean electric;
    private int calsPerMinute;
    private int avergeCalsPerH = calsPerMinute * 60;



    private String[] types = {"Cardio","Freihantel","Kabelzug","Gerät mit festen Gewichten", "Gerät mit losen Gewichten",
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

    int getCalsPerMinute() {
        return calsPerMinute;
    }

    /*Calorienverbrennung nicht linear sondern setzt erst nach 30-45 minuten Training richtig ein. wie bilde ich das richtig ab?
    nur bei Cardio wirklich ermittelbar ohne Herzschlagmessung...
    */
    public int burnedCalsPerM (int minutes) {
        int burnedCals = minutes * calsPerMinute;
        System.out.println("In "+ minutes + " Minuten hast du " + burnedCals + " kcal verbrannt");
        return burnedCals;
    }

    public int burnedCalsPerHM (int hour, int minutes) {
        int burnedCals = (hour * 60 + minutes) * calsPerMinute;
        System.out.println("In "+ minutes + " Minuten hast du " + burnedCals + " kcal verbrannt");
        return burnedCals;
    }

    public void averageCalsPerH () {
        System.out.println("Die Übung verbrennt durchschnittlich " + avergeCalsPerH + "Kalorien pro Stunde");
    }

    public boolean benoetigtStromversorgung () {
        if (electric){
            System.out.println("Das Gerät: " + name + " benötigt Strom");
        } else {
            System.out.println("Das Gerät: " + name + " benötigt keinen Strom.");
        }
        return electric;
    }

    public boolean trainsMuscle (String trainsMuscle){
        return (Arrays.asList(musclegroup.getMuscles()).contains(trainsMuscle));
    }

    public boolean trainsMGroup (String trainsMGroup){
        return (Arrays.asList(musclegroup).contains(trainsMGroup));
    }

    public boolean trainsMuscleGroup (Musclegroup trainsMuscleGroup) {
        return(trainsMuscleGroup.getName().equals(musclegroup.getName()));
    }

}
