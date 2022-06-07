public class StepTracker {
    int targetSteps = 10000;
    int months;
    int days;
    int steps;

    MonthData[] monthToData;

    public StepTracker(int months) {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData(months);
        }
    }

    class MonthData {
        DayData[] dayArray;

        public MonthData(int days) {
            dayArray = new DayData[30];
            for (int j = 0; j < dayArray.length; j++)
                dayArray[j] = new DayData(days);

        }

        public class DayData {

            public DayData(int steps) {



            }


        }

    }
}