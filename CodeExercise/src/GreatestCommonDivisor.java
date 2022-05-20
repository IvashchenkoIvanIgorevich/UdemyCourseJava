public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int smallestNumber = Math.min(first, second);

        int greatestDivisor = 1;
        for (int i = 2; i <= smallestNumber; i++) {
            if (second % i == 0 && first % i == 0)
                greatestDivisor = i;
        }

        return greatestDivisor;
    }
}
