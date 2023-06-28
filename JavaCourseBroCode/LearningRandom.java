package JavaCourseBroCode;

import java.util.Random;

public class LearningRandom {
    public static void main(String args[]) {
        Random random = new Random();

        int x = random.nextInt(6) + 1;
        System.out.println(x);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
