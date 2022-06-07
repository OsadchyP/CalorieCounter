import java.util.Arrays;

public class StepTracker {

    private MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void setCurrentStepsDay(int month, int day, int step) {
        monthToData[month].getDays()[day].setCurrentSteps(step);
    }

    public void setTargetStepsDay(int month, int day, int step) {
        monthToData[month].getDays()[day].setTargetSteps(step);
    }

    public void printStatistics(int numberMonth) {
        printCurrentStepsByMonth(numberMonth);
        printBestSeries();

    }

    private void printCurrentStepsByMonth(int numberMonth) {
        DayData[] days = monthToData[numberMonth].getDays();
        for (int i = 1; i <= days.length; i++) {
            System.out.println(i + " день: " + days[i - 1].getCurrentSteps());
        }
    }

    private void printBestSeries() {
        int seriesCounter = 0;
        int bestSeries = 0;
//        for (int i = 0; i < monthToData.length; i++) {
//            for (int j = 0; j < monthToData[i].getDays().length; j++) {
//                monthToData[i].getDays()[j].getTargetSteps();
//            }
//        }
        for (MonthData currentData : monthToData) {
            for (DayData day : currentData.getDays()) {
                if (day.getCurrentSteps() >= day.getTargetSteps()) {
                    seriesCounter++;
                    if (seriesCounter > bestSeries) {
                        bestSeries = seriesCounter;
                    }
                } else {
                    seriesCounter = 0;
                }
            }
        }
        System.out.println("Лучшая серия: " + bestSeries + " дня подряд");
    }
}