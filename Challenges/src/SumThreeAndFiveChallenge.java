public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int countConditions = 0;
        int sumConditions = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                sumConditions += i;
                countConditions++;
                System.out.println("Number that met conditions: " + i);
            }

            if (countConditions == 5){
                break;
            }
        }

        System.out.println("Sum of the numbers: " + sumConditions);
    }
}
