package math.problems;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println ("The input number is : ");
        int checkNum = scanner.nextInt();
        boolean primeNum = true;

        System.out.println("Prime numbers from 2 to " + checkNum + " are:");
        for (int i = 2; i <= checkNum; i++) {
            primeNum = CheckPrime(i);
            if (primeNum) {
                System.out.print(i+", ");
            }
        }

    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {

            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;

    }


}
