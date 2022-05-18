public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesToKiloBytes(2500);
        printMegaBytesToKiloBytes(-21);
    }

    public static void printMegaBytesToKiloBytes(int kiloBytes){
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024
                    + " MB and " + kiloBytes % 1024 + " KB");
    }
}
