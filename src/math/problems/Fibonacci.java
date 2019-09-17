package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n, x = 0, y = 0, z = 1;
        System.out.print("Fibonacci numbers:");
        for(int i = 1; i <= 40; i++)  // Write 40 Fibonacci numbers with java.

        {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x+" ");
        }
    }

}


