import java.io.*;

import java.util.*;


class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    
        int tallest = 0;
        int count = 0;
        
        for (int i = 0; i < candles.size(); i++) {
            if (tallest < candles.get(i)) {
                count = 1;
                tallest = candles.get(i);
            } else if(tallest == candles.get(i)) {
                count++;
            }
        }

        return count;
    }

}

public class BirthdayCandle {
    public static void main(String[] args) throws IOException {

        List<Integer> candles = new ArrayList<Integer>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        int result = Result.birthdayCakeCandles(candles);
        System.out.println(result);
    }
}
