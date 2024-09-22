import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chosen the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter chosen the year: ");
        int year = scanner.nextInt();
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        if (!monthName.equals("Choose a month between 1 and 12.") && days != 0) {
            System.out.println(monthName + " of " + year + " had " + days + " days.");
        } else {
            System.out.println("Choose a month between 1 and 12.");
        }
    }
    public static String getMonthName(int month) 
  {
        String[] months = { "", "January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December" };
        if (month >= 1 && month <= 12) {
            return months[month];
        } else {
        return "Choose a month between 1 and 12";
      }
    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0; // Choose a month between 1 and 12.
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}