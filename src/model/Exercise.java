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

    private Musclegroup[] mGroup;
    private Mashine mashine;

    public Exercise (String name, Mashine mashine, Musclegroup[] mGroup){
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.weight = 0;
        this.sets = 0;
        this.reps = 0;
        this.mGroup = mGroup;
        this.calAim = 0;

    }

    public Exercise (String name, Mashine mashine, double weight, int sets, int reps, int calAim, Musclegroup[] mGroup) {
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
        this.mGroup = mGroup;
        this.calAim = calAim;
    }

    public void ausgabe (){
        System.out.println("Die Übung " + number + " " + name + " soll mit " + weight + " kg in " + sets + " Sätzen zu je " + reps + " Wiederholungen ausgeführt werden.");
    }

    public int getMinutes() {
        return minutes;
    }

    public Mashine getMashine() {
        return mashine;
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
        System.out.println("Um " + calGoal + " kcal zu verbrennen musst du die Übung " + name + " für " + calGoal / mashine.getCalsPerMinute() + " Minuten ausführen");
        return calGoal / mashine.getCalsPerMinute();
    }

    public boolean trainsMuscle (String muscle){
        return true;
    }

    public void Train (int minutes) {
        this.minutes = +minutes;
    }


/*    private int calsPerMinute;

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
*/

}

