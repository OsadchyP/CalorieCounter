public class DayData {

    private int currentSteps;

    private int targetSteps;

    public DayData() {
        this.targetSteps = 10000;
        this.currentSteps = 0;
    }

    public void setCurrentSteps(int currentSteps) {
        this.currentSteps = currentSteps;
    }

    public int getCurrentSteps() {
        return currentSteps;
    }

    public int getTargetSteps() {
        return targetSteps;
    }

    public void setTargetSteps(int targetSteps) {
        this.targetSteps = targetSteps;
    }
}
//    public void setCurrentStepsDay(int numberMonth, int numberDay, int steps) {
//        getCurrentDay(numberMonth, numberDay).setCurrentSteps(steps);
//    }
//
//    public void setTargetStepsDay(int numberMonth, int numberDay, int steps) {
//        getCurrentDay(numberMonth, numberDay).setTargetSteps(steps);
//    }
//
//    private DayData getCurrentDay(int numberMonth, int numberDay) {
//        return this.monthToData[numberMonth].getDays()[numberDay];
//    }