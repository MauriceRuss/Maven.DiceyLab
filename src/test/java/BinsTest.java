import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void binTest(){
        //given
        Bins bin1 = new Bins(2);
        //when
        Integer expected = 11;
        Integer actual = bin1.rollCount.size();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void binTest2(){
        //given
        Bins bin1 = new Bins(3);
        //when
        Integer expected = 16;
        Integer actual = bin1.rollCount.size();
        //then
        Assert.assertEquals(expected, actual);

    }
}
