package salvos.mangoitems.util;

import org.apache.commons.lang3.Validate;

import java.util.Random;

public class RandomUtil {
    private static final Random RAND = new Random();

    public static int randomInteger(int min, int max) throws IllegalArgumentException {
        Validate.isTrue(max > min, "Max can't be smaller than min!");
        return RAND.nextInt(max - min + 1) + min;
    }

    public static double randomDouble(double min, double max) throws IllegalArgumentException {
        Validate.isTrue(max > min, "Max can't be smaller than min!");
        return min + (max - min) * RAND.nextDouble();
    }
}
