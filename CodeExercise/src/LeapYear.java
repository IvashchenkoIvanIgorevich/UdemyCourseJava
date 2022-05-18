public class LeapYear {
    public static void main(String[] args){
        System.out.println("-1600 is leap year: " + isLeapYear(-1600));
        System.out.println("1600 is leap year: " + isLeapYear(1600));
        System.out.println("2017 is leap year: " + isLeapYear(2017));
        System.out.println("2000 is leap year: " + isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999)
            return false;

        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
