package os;

import java.util.Random;

public class Page
{
    public int id;
    public int physical;
    public byte R;
    public byte M;
    public int inMemTime;
    public int lastTouchTime;
    public long high;
    public long low;
    Random rand = new Random();
    // public int counterField = rand.nextInt(25);
    //public int counterField = -1;
    // відповідні аппаратні дані кожної сторінки
    // R - сторінка була прочитана M - модифікована.  ==> 1 - так, була.  0 - ні, не була.
    public Page( int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low )
    {
        this.id = id;
        this.physical = physical;
        this.R = R;
        this.M = M;
        this.inMemTime = inMemTime;
        this.lastTouchTime = lastTouchTime;
        this.high = high;
        this.low = low;
    }

}
