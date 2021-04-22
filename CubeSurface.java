public class CubeSurface {
    public static void main(String[] args) {
        int[] input = { 2, 2 };
        int sideCount = 0;
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 1) {
                sideCount += input[i] * (5);
            } else if (input[i] == 1) {
                sideCount += 6;
            } else {
                sideCount += 0;
            }

            input[i] -= 1;
            if (input[i] < 1) {
                break;
            }
            counter += input.length;
        }

        System.out.println(sideCount - counter);
    }
}
