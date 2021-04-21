import java.util.*;

class MinMax_sum{
 // Complete the miniMaxSum function below.
static void miniMaxSum(int[] arr) {
        
    Arrays.sort(arr);
    long sum = 0;
    
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
        System.out.print(arr[i] + " ");
    }
    
    System.out.println();
    System.out.println(sum);
    long minSum = sum - arr[arr.length - 1];
    long maxSum = sum - arr[0];
    
    System.out.println(minSum + " " + maxSum);

}

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    int[] arr = new int[5];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < 5; i++) {
        int arrItem = Integer.parseInt(arrItems[i]);
        arr[i] = arrItem;
    }

    miniMaxSum(arr);

    scanner.close();
}
}