package model;

public class Exercise {

    private String name;
    private String type; //Cardio MaxKraft SchnellKraft Hypertrophie Regeneration Extra Klasse Trainigsziel
    private double weight;
    private int sets, reps;
    private int number;    //Nummer der Übung später Metode um Rheinfolge der Übungen zu ändern
    private int calAim;
    private int minutes;
    private static int nextNumber = 1;
    private Musclegroup mGroup1;
    private String [] muscles;
    private Mashine mashine;

    public Exercise (String name, Mashine mashine, String[] muscles){
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.weight = 0;
        this.sets = 0;
        this.reps = 0;
        this.muscles = muscles;
        this.calAim = 0;

    }

    public Exercise (String name, Mashine mashine, double weight, int sets, int reps, int calAim, String [] muscles) {
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
        this.muscles = muscles;
        this.calAim = calAim;
    }

    public void ausgabe (){
        System.out.println("Die Übung " + number + " " + name + " soll mit " + weight + " kg in " + sets + " Sätzen zu je " + reps + " Wiederholungen ausgeführt werden.");
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    public boolean calGoal (int calGoal){
        if (calGoal >= minutes * mashine.getCalsPerMinute()){
            System.out.println("Du hast dein Kalorienziel erreicht!");
            return true;
        } else{
            System.out.println("Du hast nicht hart genug trainiert");
            return false;
        }
    }

    public int timeNessesary (int calGoal) {
        return calGoal / mashine.getCalsPerMinute();
    }


}

