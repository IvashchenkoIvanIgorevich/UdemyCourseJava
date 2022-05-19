public class Main {
    public static void main(String[] args){
        // HelloWorld module
        System.out.println(Printer.PrintHello());

        //DataType module
        PrintMinMaxValue(Integer.MIN_VALUE, Integer.MAX_VALUE);
        PrintMinMaxValue(Byte.MIN_VALUE, Byte.MAX_VALUE);
        PrintMinMaxValue(Short.MIN_VALUE, Short.MAX_VALUE);
        PrintMinMaxValue(Long.MIN_VALUE, Long.MAX_VALUE);
        PrintMinMaxValue(Float.MIN_VALUE, Float.MAX_VALUE);
        PrintMinMaxValue(Double.MIN_VALUE, Double.MAX_VALUE);

        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++){
                if (i == 1 || i == number || j == 1 || j == number || (j == number - i + 1) || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int getLargestPrime(int number){
        if (number <= 1)
            return -1;

        int largestPrime = Integer.MIN_VALUE;
        for (int i = 2; i <= number; i++){
            boolean isPrimeNumber = true;
            if (number % i == 0){
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrimeNumber = false;
                        break;
                    }
                }
                if (isPrimeNumber && i > largestPrime)
                    largestPrime = i;
            }
        }

        return largestPrime;
    }

    private static void PrintMinMaxValue(Object minValue, Object maxValue){
        String type = minValue.getClass().getSimpleName();
        System.out.println("Min value of " + type + ": " + minValue);
        System.out.println("Max value of " + type + ": " + maxValue);
    }
}
