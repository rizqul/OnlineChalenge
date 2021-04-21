

public class HourGlass {
    public static void main(String[] args) {

        int[][] arr = new int [6][6];
        int fill = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = fill;
                fill++;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                temp = arr[i][j] + arr[i+1][j+1] + arr[i+1][j-1]+ arr[i+1][j] + arr[i-1][j+1] + arr[i-1][j-1] + arr[i-1][j];
                if (temp > sum) {
                    sum = temp;
                }
                System.out.print(sum + " ");
            }
        }

        System.out.println(sum);
    }
}
