package model;

public class Exercise {

    private String name;
    private String type; //Cardio MaxKraft SchnellKraft Hypertrophie Regeneration Extra Klasse Trainigsziel
//    private double weight;
//    private int sets, reps;
    private int calAim;
    private String startDate;
    private int startHour, startMinute;
    private int minutes;
    private int number;    //Nummer der Übung später Metode um Rheinfolge der Übungen zu ändern
    private static int nextNumber = 1;
    private Musclegroup[] mGroup;
    private Mashine mashine;

    public Exercise (String name, Mashine mashine){
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.mGroup = null;
        this.calAim = 0;
    }
    public Exercise (String name, Mashine mashine, Musclegroup[] mGroup,String startDate, int startHour, int startMinute ){
        number = Exercise.nextNumber++;
        this.name = name;
        this.mashine = mashine;
        this.mGroup = mGroup;
        this.startDate = startDate;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.calAim = 0;
    }


    public int getMinutes() {
        return minutes;
    }
    public Mashine getMashine() {
        return mashine;
    }

    public void setCalAim(int calAim) {
        this.calAim = calAim;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

// if logik in App nicht in Methode
    public boolean calGoal (int calGoal){
        return calGoal <= minutes * mashine.getdCalsPerMinute();
    }


    // Minuten auch in Stunden umrechnen
    public int timeNessesary (int calGoal) {
        System.out.println("Um " + calGoal + " kcal zu verbrennen musst du die Übung " + name + " für " + calGoal / mashine.getCalsPerMinute() + " Minuten ausführen");
        return calGoal / mashine.getCalsPerMinute();
    }

    public boolean trainsMuscle (String muscle){
        return true;
    }

    // Auf minuten durch getter aufrufen
    public void train (){
        this.minutes++;
    }

    public void train (int minutes) {
        this.minutes += minutes;
    }


/*    private int calsPerMinute;

    public int burnedCals (int minutes) {
        int burnedCals = minutes * calsPerMinute;
        System.out.println("In "+ minutes + " Minuten hast du " + burnedCals + " kcal verbrannt");
        return burnedCals;
    }

    public int burnedCals (int hour, int minutes) {
        int burnedCals = (hour * 60 + minutes) * calsPerMinute;
        System.out.println("In "+ minutes + " Minuten hast du " + burnedCals + " kcal verbrannt");
        return burnedCals;
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
*/

}

