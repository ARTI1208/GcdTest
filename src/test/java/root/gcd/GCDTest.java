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
        GCD gcd=new GCD();
        int answer1=gcd.gcd(0,0);
        int answer2=gcd.gcd(10,0);
        int answer3=gcd.gcd(0,7);
        Assert.assertTrue(answer1==0 && answer2==10 && answer3==7);
    }

    @Test
    public void coprimeIntegers() {
        GCD gcd=new GCD();
        int answer=gcd.gcd(15,8);
        Assert.assertEquals(answer,1);
    }

    @Test
    public void equalArgs() {
        GCD gcd=new GCD();
        int answer=gcd.gcd(7,7);
        Assert.assertEquals(answer,7);
    }

    @Test
    public void argDividesArg() {

    }

    @Test
    public void notEqualArgsMaxGcd() {
        GCD gcd=new GCD();
        int res=gcd.gcd(45,60);
        Assert.assertEquals(res,15);
    }

    @Test
    public void borderArgs() {

    }


}