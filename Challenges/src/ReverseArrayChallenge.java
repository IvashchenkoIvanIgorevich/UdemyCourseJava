import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {1,2};

        System.out.println("Original array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse array: " + Arrays.toString(array));
    }

    private static void reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
