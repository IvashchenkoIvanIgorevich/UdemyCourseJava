public class SpeedConverter {
    public static void main(String[] args){
        printConversion(25.42);
        printConversion(-2.0);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0)
            return -1L;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = "
                    + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
