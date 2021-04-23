import java.util.Arrays;
import java.util.Scanner;

class MaksMin{
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);
        int n = fa.nextInt();
        int [] array = new int [n];

        for(int i = 0 ; i<n ; i++){
            array[i] = fa.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            Arrays.sort(array);
        }
        System.out.println("Nilai maksimum : " + array[n-1]);
        System.out.println("Nilai minimum : " + array[0]);
        
}
}