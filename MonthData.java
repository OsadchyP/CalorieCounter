public class MonthData {

    private DayData[] days;

    public MonthData() {
        days = new DayData[30];
        for (int j = 0; j < days.length; j++)
            days[j] = new DayData();
    }

    public DayData[] getDays() {
        return days;
    }
}