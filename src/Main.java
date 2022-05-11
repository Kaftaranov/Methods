import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        int yearToDetermine = 2024;     //Год для определения на високосность
        String OS = "Android";          //"ios" - альтернативная операционная система
        int deviceYear = 2020;          //Год производства гаджета
        int deliveryDistance = 95;      //Расстояние до клиента
//Задача 1
        if (isLeapYear(yearToDetermine)) {
            System.out.println(yearToDetermine + " is leap.");}
        else System.out.println(yearToDetermine + " is not leap.");
        System.out.println("------------------------------------------------------------------");
//Задача 2
        if (checkDeviceData(OS, deviceYear))
        {System.out.println("Your operating system is " + OS);
         System.out.println("Your device production year is " + deviceYear);
         suggestToDownloadApp(OS, deviceYear);
        }
        System.out.println("------------------------------------------------------------------");
//Задача 3
        if (deliveryDays(deliveryDistance) < 4)
           {System.out.println("Delivery will take " + deliveryDays(deliveryDistance) + " day(s).");}
        else {System.out.println("You are out of our service area.");}
        System.out.println("------------------------------------------------------------------");
    }
//Метод для задачи 1
    public static boolean isLeapYear(int year)
    {return year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0;}

//Методы для задачи 2
    public static boolean checkDeviceData(String clientOperSys, int clientDeviceYear)
    {
        if (!clientOperSys.equalsIgnoreCase("Android") && !clientOperSys.equalsIgnoreCase("iOS"))
        {System.out.println("You use unknown operating system."); return false;}
        else if (clientDeviceYear > LocalDate.now().getYear())
        {System.out.println("You have entered wrong year of production!"); return false;}
        else return true;
    }
    public static void suggestToDownloadApp (String clientOperSys, int clientDeviceYear)
    {
        if (clientOperSys.equalsIgnoreCase("Android") && clientDeviceYear < LocalDate.now().getYear())
        {System.out.println("We recommend you to install light version of our Android application from here.");}
        if (clientOperSys.equalsIgnoreCase("Android") && clientDeviceYear == LocalDate.now().getYear())
        {System.out.println("Congratulations! You may install latest version of our Android application from here.");}
        if (clientOperSys.equalsIgnoreCase("iOS") && clientDeviceYear < LocalDate.now().getYear())
        {System.out.println("We recommend you to install light version of our application for iOS from here.");}
        if (clientOperSys.equalsIgnoreCase("iOS") && clientDeviceYear == LocalDate.now().getYear())
        {System.out.println("Congratulations! You may install latest version of our iOS application from here.");}
    }
//Метод для задачи 3
    public static byte deliveryDays(int distance)
    {
        if (distance < 20) return 1;
        else if (distance >= 20 && distance < 60) return 2;
          else if (distance >= 60 && distance < 100) return 3;
           else return 4;
    }
}