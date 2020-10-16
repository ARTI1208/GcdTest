package root.gcd;

import org.junit.Assert;
import org.junit.Test;


public class GCDTest {

    @Test
    public void positiveArgs() {
        GCD gcd = new GCD();
        int res = gcd.gcd(12, 7);
        Assert.assertTrue(res > 0);

    }

    @Test
    public void negativeArgs() {
        GCD gcd = new GCD();
        int a = gcd.gcd(-12,9);
        int b = gcd.gcd(12,-9);
        int c = gcd.gcd(-12,-9);
        Assert.assertTrue(a==3 && b==3 && c==3);
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
        GCD gcd = new GCD();
        int a = gcd.gcd(4,12);
        int b = gcd.gcd(12,4);
        int c = gcd.gcd(-4,12);
        int d = gcd.gcd(12,-4);
        int e = gcd.gcd(4,-12);
        int f = gcd.gcd(-12,4);
        int g = gcd.gcd(-4,-12);
        Assert.assertTrue(a==4 && b==4 && c==4 && d==4 && e==4 && f==4 && g==4);
    }

    @Test
    public void notEqualArgsMaxGcd() {
        GCD gcd=new GCD();
        int res=gcd.gcd(45,60);
        Assert.assertEquals(res,15);
    }

    @Test
    public void borderArgs() {
        GCD gcd=new GCD();
        int answer=gcd.gcd(Integer.MAX_VALUE,Integer.MAX_VALUE);
        int answer2=gcd.gcd(Integer.MAX_VALUE,Integer.MIN_VALUE);
        int answer3=gcd.gcd(Integer.MIN_VALUE,Integer.MIN_VALUE);
        Assert.assertTrue(answer==Integer.MAX_VALUE && answer2==Integer.MIN_VALUE && answer3==1);
    }


}