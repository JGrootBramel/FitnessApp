package model;

public class Exercise {

    private String name;
    private String startDate;
    private int startHour, startMinute;
    private int minutes;
    private int number;    //Nummer der Übung später Metode um Rheinfolge der Übungen zu ändern
    private Musclegroup[] mGroup;
    private Mashine mashine;

    public Exercise (){}
    public Exercise (String name, Mashine mashine){
        setName(name);
        setMashine(mashine);
        setmGroup(null);
    }
    public Exercise (String name, Mashine mashine, Musclegroup[] mGroup,String startDate, int startHour, int startMinute ){

        setName(name);
        setMashine(mashine);
        setmGroup(mGroup);
        setStartDate(startDate);
        setStartHour(startHour);
        setStartMinute(startMinute);
    }

    public String getName() {
        return name;
    }
    public String getStartDate() {
        return startDate;
    }
    public int getStartHour() {
        return startHour;
    }
    public Musclegroup[] getmGroup() {
        return mGroup;
    }
    public int getMinutes() {
        return minutes;
    }
    public Mashine getMashine() {
        return mashine;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }
    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }
    public void setmGroup(Musclegroup[] mGroup) {
        this.mGroup = mGroup;
    }
    public void setMashine(Mashine mashine) {
        this.mashine = mashine;
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

