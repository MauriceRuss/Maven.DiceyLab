import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Bins {
   public ArrayList<Integer> rollCount = new ArrayList<Integer>();

   public Bins (int numberOfDice){
      int minValueIndex = numberOfDice;
      int maxValueIndex = numberOfDice * 6;
      for(int i = minValueIndex; i <= maxValueIndex; i++){
          this.rollCount.add(0);
      }

   }


}
