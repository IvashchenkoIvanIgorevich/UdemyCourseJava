public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    static boolean isOdd(int number){
        if (number <= 0)
            return false;

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if (start <= 0 || end < start)
            return -1;

        int resultOfSumOdd = 0;

        for (int i = start; i <= end; i++){
            if (isOdd(i))
                resultOfSumOdd += i;
        }

        return resultOfSumOdd;
    }
}
