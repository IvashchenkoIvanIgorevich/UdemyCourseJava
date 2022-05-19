import javax.sound.midi.Soundbank;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(-1221 + " is palindrome" + isPalindrome(-1221));
        System.out.println(707 + " is palindrome: " + isPalindrome(707));
        System.out.println(112112 + " is palindrome: " + isPalindrome(112112));
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int reverse = 0;
        int calcNum = number;

        while (calcNum > 0){
            int lastDigit = calcNum % 10;
            reverse += lastDigit;
            reverse *= 10;

            calcNum /= 10;
        }

        return number == reverse / 10;
    }
}
