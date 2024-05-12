package Pair;

import java.util.Arrays;
import java.util.Random;

public class ArrayAlgTest {
    public static void main(String[] args) {
        double[] d = new double[10];

        for (int i = 0; i < d.length; i++) {
            d[i] = new Random().nextDouble() * 10;
        }

        System.out.println(Arrays.toString(d));
        ArrayAlg.Pair pair = ArrayAlg.minmax(d);
        System.out.println(pair);
    }
}
