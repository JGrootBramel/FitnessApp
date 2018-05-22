package model;

public class ExerciseWithAim extends Exercise { //implements TrainingAim {
    int calAim;

    public Training (String name, Mashine mashine, Musclegroup[] mGroup,String startDate, int startHour, int startMinute, int calAim) {
        setName(name);
        setMashine(mashine);
        setmGroup(mGroup);
        setStartDate(startDate);
        setStartHour(startHour);
        setStartMinute(startMinute);
        setCalAim(calAim);
        this.calAim = calAim;
    }

    public int getCalAim() {
        return calAim;
    }
    public void setCalAim(int calAim) {
        this.calAim = calAim;
    }
}
