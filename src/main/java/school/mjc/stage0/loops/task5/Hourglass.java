package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        boolean isOdd = height % 2 == 0;
        int halfP = isOdd ? height / 2 : height / 2 + 1;
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= height; col++) {
                if (row == 1 || row == height || col == row || col == halfP || col == height - row + 1
                        || (col > row && col < height - row + 1)
                        || (row > halfP && col > height - row && col < row)) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
