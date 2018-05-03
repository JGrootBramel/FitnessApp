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
    private double dCalsPerMinute;
    private double avergeCalsPerH;

    public Mashine(String name, String type, Musclegroup musclegroup, int maxTime, int calsPerMinute, boolean electric) {
        this.name = name;
        this.type = type;
        this.maxTime = maxTime;
        this.musclegroup = musclegroup;
        this.calsPerMinute = calsPerMinute;
        dCalsPerMinute = calsPerMinute;
        this.electric = electric;
        avergeCalsPerH = calsPerMinute * 60;
    }

    public Mashine(String name, Musclegroup musclegroup, int maxTime, double averageCalsPerH, boolean electric) {
        this.name = name;
        this.maxTime = maxTime;
        this.musclegroup = musclegroup;
        this.avergeCalsPerH = averageCalsPerH;
        dCalsPerMinute = averageCalsPerH / 60;
        this.electric = electric;
    }

    public double getdCalsPerMinute() {
        return dCalsPerMinute;
    }

    int getCalsPerMinute () {
        return calsPerMinute;
    }
    double getAvergeCalsPerH () {
        return avergeCalsPerH;
    }

    public String getName () {
        return name;
    }


    /*Calorienverbrennung nicht linear sondern setzt erst nach 30-45 minuten Training richtig ein. wie bilde ich das richtig ab?
        nur bei Cardio wirklich ermittelbar ohne Herzschlagmessung...
    */


    public double burnedCals ( int minutes){
        double burnedCals = minutes * dCalsPerMinute;
        return burnedCals;
    }


        public int burnedCals ( int hour, int minutes){
            int burnedCals = (hour * 60 + minutes) * calsPerMinute;
            return burnedCals;
        }

        public double averageCalsPerH () {
            return avergeCalsPerH;
        }

        public boolean benoetigtStromversorgung () {
            if (electric) {
                System.out.println("Das Gerät: " + name + " benötigt Strom");
            } else {
                System.out.println("Das Gerät: " + name + " benötigt keinen Strom.");
            }
            return electric;
        }

        public boolean trainsMuscle (String trainsMuscle){
            return (Arrays.asList(musclegroup.getMuscles()).contains(trainsMuscle));
        }

        public boolean trainsMGroup (Musclegroup trainsMGroup){
            return (musclegroup == trainsMGroup);
        }
    }






/*
        //Validitätscheck für den Gerätetypen
        if (Arrays.asList(types).contains(type)){
            this.type = type;
        } else {
            System.out.println("Der Gerätetype " + type + " ist kein valider Typ");
            System.out.println("Bitte gib einen der folgenden Typen:");
            for (int i = 0; i < types.length; i++) System.out.println(types[i]);
        }



    private String[] types = {"Cardio","Freihantel","Kabelzug","Gerät mit festen Gewichten", "Gerät mit losen Gewichten",
            "Gerät für Eigenkörpergewicht"};
 */