import org.junit.Assert;

import java.util.Random;

public class DiceTest {


    @org.junit.Test
    public void toss() {
        //given
        Dice dice1 = new Dice(2);
        dice1.setSeed();
        //when
        int result = dice1.toss();
        System.out.println(result);

        result = dice1.toss();
        System.out.println(result);

        result = dice1.toss();
        System.out.println(result);
        //then
        Assert.assertEquals(result, 5);
    }


}
