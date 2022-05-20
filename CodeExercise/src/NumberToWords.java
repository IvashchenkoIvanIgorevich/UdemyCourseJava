public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int reverseNumber = reverse(number);
        int diffCountDigit = getDigitCount(number) - getDigitCount(reverseNumber);

        do{
            int digit = reverseNumber % 10;

            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }while (reverseNumber > 0);

        for (int i = 1; i <= diffCountDigit ; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        int result = 0;
        boolean isNegative = number < 0;

        while (number != 0){
            int digit = number % 10;
            result += digit;
            result *= 10;
            number /= 10;
        }

        result /= 10;

        return isNegative ? result * -1 : result;
    }

    public static int getDigitCount(int number){
        if (number < 0)
            return -1;

        int count = 0;
        while (number > 0){
            number /= 10;
            count++;
        }

        return count;
    }
}
