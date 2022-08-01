package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
       for(int i=1;i<=height;i++) {
           for(int j=1;j<=height;j++) {
               if(i<=j || i >height-j) {
                   System.out.print("8");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(6);
    }
}
