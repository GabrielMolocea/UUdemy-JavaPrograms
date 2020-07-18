public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean canPack = false;
        if (bigCount == 0 && smallCount >= goal){
            canPack = true;
        }

        while (bigCount > 0){
            goal -=5;
            bigCount--;
            if (goal >= 0 && goal <= smallCount){
                canPack =true;
            }
        }
        return canPack;
    }
}
