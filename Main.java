import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите номер месяца");
                int numberMonth = scanner.nextInt();
                System.out.println("Введите номер дня");
                int numberDay = scanner.nextInt();
                System.out.println("Введите кол-во шагов");
                int steps = scanner.nextInt();
                StepTracker.MonthData.DayData(numberDay,numberMonth,steps);


            } else if (command == 2) {
                // вызов метода
            } else if (command == 3) {
                // вызов метода
            } else if (command == 4) {
                System.out.println("Выход.");
                break;

            } else {
                System.out.println("Извините, такой команды пока нет.");

            }
        }
    }

    private static void printMenu() {

        System.out.println("Выберите команду");
        System.out.println("1.Ввести количество шагов за определённый день");
        System.out.println("2.Напечатать статистику за определённый месяц");
        System.out.println("3.Изменить цель по количеству шагов в день");
        System.out.println("4.Выйти из приложения");
    }

}

