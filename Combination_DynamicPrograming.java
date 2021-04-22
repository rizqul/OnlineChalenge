import java.util.Scanner;

public class Combination_DynamicPrograming {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter object of combination :");
        int n = sc.nextInt();
        System.out.println("Enter sample of combination :");
        int m = sc.nextInt();
        sc.close();
        long[][] combi = new long[n + 1][n + 1];

        for (int i = 0; i < combi.length; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                if ((j == 0) || (i == j)) 
                {
                    combi[i][j] = 1;
                } else 
                {
                    combi[i][j] = combi[i-1][j-1] + combi[i-1][j];
                    if (i == n && j == m ) 
                    {
                        System.out.println("Combination of "+ n + " and "+ m + " is : " + combi[n][m]);
                        return;
                    }
                }
            }
        }

        
    }
}
