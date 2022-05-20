public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the first and last digits in the number " + 252 + " is: " + sumFirstAndLastDigit(252));
        System.out.println("The sum of the first and last digits in the number " + 257 + " is: " + sumFirstAndLastDigit(257));
        System.out.println("The sum of the first and last digits in the number " + 0 + " is: " + sumFirstAndLastDigit(0));
        System.out.println("The sum of the first and last digits in the number " + 5 + " is: " + sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and last digits in the number " + -10 + " is: " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int sum = number % 10;

        while (number > 0) {
            if (number < 10) {
                sum += number;
                break;
            }

            number /= 10;
        }

        return sum;
    }
}

