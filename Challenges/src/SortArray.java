import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInteger = getArray(5);
        printArray(myInteger);
        int[] sorted = sort(myInteger);
        printArray(sorted);
    }

    static int[] sort(int[] array){
        int[] result = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < result.length - 1; i++){
                if (result[i] < result[i+1]){
                    temp = result[i+1];
                    result[i+1] = result[i];
                    result[i] = temp;
                    flag = true;
                }
            }
        }

        return result;
    }
    static int[] getArray(int number){
        int[] result = new int[number];
        for (int i = 0; i < number; i++){
            result[i] = scanner.nextInt();
        }

        return result;
    }
    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
