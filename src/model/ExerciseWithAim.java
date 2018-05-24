package model;

public class ExerciseWithAim
        extends Exercise
        implements TrainingAim {

    int calAim;

    public ExerciseWithAim (String name, Mashine mashine, Musclegroup[] mGroup,String startDate, int startHour, int startMinute, int calAim) {
        super(name, mashine, mGroup, startDate, startHour, startMinute);
        setCalAim(calAim);
    }

    @Override
    public void train (int minutes) {
        super.train(minutes);
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
        if (calAim <= 0 ){
            this.calAim = calAim;
        }
    }

    @Override
    public double getDegree(){
        double degree = (int)(burnedCals(getMinutes())*10000.0/calAim)/100.0;
        return degree;
    }
}
