package root.gcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void positiveArgs() {
        GCD gcd = new GCD();

        int res = gcd.gcd(12, 7);
        Assert.assertTrue(res > 0);
    }

    @Test
    public void negativeArgs() {
    }

    @Test
    public void zeroArgs() {
    }

    @Test
    public void coprimeIntegers() {
    }

    @Test
    public void equalArgs() {
    }

    @Test
    public void argDividesArg() {
    }

    @Test
    public void notEqualArgsMaxGcd() {
    }

    @Test
    public void borderArgs() {
    }


}