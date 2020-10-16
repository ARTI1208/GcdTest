package root.gcd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GCDTest {

    @Test
    public void positiveArgs() {
        GCD gcd = new GCD();
        int res = gcd.gcd(12, 7);
        Assertions.assertTrue(res > 0);

    }

    @Test
    public void negativeArgs() {
        GCD gcd = new GCD();

        int a = gcd.gcd(-12, 9);
        Assertions.assertEquals(3, a);

        int b = gcd.gcd(12, -9);
        Assertions.assertEquals(3, b);

        int c = gcd.gcd(-12, -9);
        Assertions.assertEquals(3, c);
    }

    @Test
    public void zeroArgs() {
        GCD gcd = new GCD();

        int answer1 = gcd.gcd(0, 0);
        Assertions.assertEquals(0, answer1);

        int answer2 = gcd.gcd(10, 0);
        Assertions.assertEquals(10, answer2);

        int answer3 = gcd.gcd(0, 7);
        Assertions.assertEquals(7, answer3);
    }

    @Test
    public void coprimeIntegers() {
        GCD gcd = new GCD();
        int answer = gcd.gcd(15, 8);
        Assertions.assertEquals(1, answer);
    }

    @Test
    public void equalArgs() {
        GCD gcd = new GCD();
        int answer = gcd.gcd(7, 7);
        Assertions.assertEquals(7, answer);
    }

    @Test
    public void argDividesArg() {
        GCD gcd = new GCD();

        int a = gcd.gcd(4, 12);
        Assertions.assertEquals(4, a);

        int b = gcd.gcd(12, 4);
        Assertions.assertEquals(4, b);

        int c = gcd.gcd(-4, 12);
        Assertions.assertEquals(4, c);

        int d = gcd.gcd(12, -4);
        Assertions.assertEquals(4, d);

        int e = gcd.gcd(4, -12);
        Assertions.assertEquals(4, e);

        int f = gcd.gcd(-12, 4);
        Assertions.assertEquals(4, f);

        int g = gcd.gcd(-4, -12);
        Assertions.assertEquals(4, g);
    }

    @Test
    public void notEqualArgsMaxGcd() {
        GCD gcd = new GCD();
        int res = gcd.gcd(45, 60);
        Assertions.assertEquals(15, res);
    }

    @Test
    public void borderArgs() {
        GCD gcd = new GCD();

        int answer = gcd.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Assertions.assertEquals(Integer.MAX_VALUE, answer);

        int answer2 = gcd.gcd(Integer.MAX_VALUE, Integer.MIN_VALUE);
        Assertions.assertEquals(1, answer2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> gcd.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }


}