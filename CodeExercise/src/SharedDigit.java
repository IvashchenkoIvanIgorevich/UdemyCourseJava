public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99)
            return false;

        boolean result = false;
        while (firstNum > 0){
            int digitFirstNum = firstNum % 10;

            int checkSecondNum = secondNum;
            while (checkSecondNum > 0){
                int digitSecondNum = checkSecondNum % 10;
                if (digitFirstNum == digitSecondNum){
                    result = true;
                    break;
                }

                checkSecondNum /= 10;
            }

            firstNum /= 10;
        }

        return result;
    }
}
