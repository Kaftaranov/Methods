public class Main {
    public static void main(String[] args) {
        int year = 2148;
        if (isLeapYear(year)) {
            System.out.println(year + " is leap.");}
        else System.out.println(year + " is not leap.");
    }
    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}