package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
         int col = sideLength/2+1;
         for(int i=1;i<=sideLength;i++) {
             for (int j = 1; j <= sideLength; j++) {
                 if(i==col) {
                     System.out.print("8");
                 }
                 else if (j == col) {
                     System.out.print("8");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
