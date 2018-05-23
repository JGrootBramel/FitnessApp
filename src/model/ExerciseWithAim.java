package model;

public class ExerciseWithAim extends Exercise implements TrainingAim {
    int calAim;

    public ExerciseWithAim (String name, Mashine mashine, Musclegroup[] mGroup,String startDate, int startHour, int startMinute, int calAim) {
        super(name, mashine, mGroup, startDate, startHour, startMinute);
        this.calAim = calAim;
    }

    @Override
    public void train (int minutes) {
        super.train(minutes);
        //int trained = getMinutes();         //Kann ich diesen teil des bobys mit super aus der
        //setMinutes(trained + minutes);      //Superclass übernehmen?
        if (burnedCals(minutes) > calAim){
            System.out.println("Hurra!");
        }
    }

    @Override
    public int getCalAim() {
        return calAim;
    }

    @Override
    public void setCalAim(int calAim) {
        this.calAim = calAim;
    }

    @Override
    public double getDegree(){
        double degree = (int)(burnedCals(getMinutes())*10000.0/calAim)/100.0;
        if ( degree >= 100.0){
            System.out.println("Hurra");
        }
        return degree;
    }
}
