package Java_Programming_Assessment;

import java.util.Scanner;
public class Challenge9_DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) representing day of week: ");
        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        System.out.println(dayName);
        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("💡 Explanation: Day " + dayNumber + " corresponds to " + dayName);
        }

        scanner.close();
    }
}
