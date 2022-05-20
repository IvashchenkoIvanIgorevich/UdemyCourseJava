import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10){
            System.out.print("Enter number #" + count + ": ");
            if (scan.hasNextInt()){
                sum += scan.nextInt();
                count++;
            }
            else
                System.out.println("Invalid Number");

            scan.nextLine();
        }
        System.out.println("The Sum of ten integer numbers is: " + sum);
        scan.close();
    }
}
