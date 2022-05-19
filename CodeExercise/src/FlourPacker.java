public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0 || (smallCount == 0 && bigCount == 0))
            return false;

        if (bigCount * 5 + smallCount < goal)
            return false;

        boolean packHasDone = false;

        if (bigCount == 0){
            for (int i = 1; i <= smallCount; i++) {
                if (goal == i){
                    packHasDone = true;
                    break;
                }
            }
        }
        else {
            for (int i = 5; i <= bigCount * 5; i += 5) {
                if (goal < i)
                    continue;
                if (goal == i) {
                    packHasDone = true;
                    break;
                }

                for (int j = 1; j <= smallCount; j++) {
                    if (goal == i + j) {
                        packHasDone = true;
                        break;
                    }
                }
            }
        }

        return packHasDone;
    }
}
