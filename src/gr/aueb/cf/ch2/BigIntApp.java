package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInt demo
 */

public class BigIntApp {


    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234566778990000065969659");
        BigInteger bigNum2 = new BigInteger("1234566778990000065969679");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
