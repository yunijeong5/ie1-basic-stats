import java.util.Arrays;
import java.util.Collections;


public class MinMaxCalculation {
   public static double getMinimum(Integer[] numArray) {
       return Collections.min(Arrays.asList(numArray));
   }


   public static double getMaximum(Integer[] numArray) {
       return Collections.max(Arrays.asList(numArray));
   }
}
