package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int[] array1 = {10, 23, 54, 18, 21, 30, 43, 11};
        int[] array2 = {19, 25, 31, 77, 27, 33, 18, 27};
        int[] A = FindLowestDifference.Sort(array1);
        int[] B = FindLowestDifference.Sort(array2);

        //assuiming largest number is lowest difference and comparing with other difference
        int n1= A[A.length-1];

        for (int i = 0; i < A.length - 1; i++) {
            int a = (A[i + 1] - A[i]);
            if (a < n1)
                n1 = a;
        }
// from sorted array1 n1 is our lowest difference, we store it at n;
        int n = n1;

        int n2 = 77;
        for (int i = 0; i < A.length - 1; i++) {
            int a = (A[i + 1] - A[i]);
            if (a < n2)
                n2 = a;
        }
// from sorted array2 n2 is our lowest difference, we store it at n;

        if (n2 < n1)
            n = n2;

        System.out.println(n);


    }

    public static int[] Sort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        return list;

    }

}





