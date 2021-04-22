import java.util.Scanner;

public class MatrixFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cek = true;
        while (cek) {
            int num = sc.nextInt();
            if (num == 0) {
                cek = false;
            } else if (num < 0 || num > 100) {
                return;
            }

            sc.close();

            int[][] frame = new int[num][num];
            int save = 1;
            int simpan1 = 0;
            int simpan2 = 0;
            int simpanMax1 = frame.length;
            int simpanMax2 = frame.length;

            while (save != 48) {

                for (int i = simpan1; i < simpanMax1; i++) {
                    for (int j = simpan2; j < simpanMax2; j++) {
                        if (i == simpan1 || j == simpan2 || i == simpanMax1 - 1 || j == simpanMax2 - 1) {
                            frame[i][j] = save;
                        }
                    }
                }

                simpan1++;
                simpanMax1--;
                simpan2++;
                simpanMax2--;
                save++;
            }

            for (int i = 0; i < frame.length; i++) {
                for (int j = 0; j < frame.length; j++) {
                    System.out.print(frame[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}