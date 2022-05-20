import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");

            if (!scan.hasNextInt()){
                System.out.println("The min = " + minNumber + " max = " + maxNumber);
                break;
            }
            int enterNumber = scan.nextInt();

            if (enterNumber > maxNumber)
                maxNumber = enterNumber;
            if (enterNumber < minNumber)
                minNumber = enterNumber;

            scan.nextLine();
        }

        scan.close();
    }
}
