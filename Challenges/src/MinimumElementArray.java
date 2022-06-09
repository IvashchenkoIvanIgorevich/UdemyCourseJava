import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.print("Print count of array: ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                flag = false;
            }
            else {
                System.out.println("Invalid enter value, only integer!");
            }
        }
        int[] array = readIntegers(count);
        System.out.println("Min value is: " + findMin(array));
    }

    static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    static int findMin(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }
}
