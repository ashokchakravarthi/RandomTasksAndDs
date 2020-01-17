import java.io.*;
import java.util.HashSet;

class FindTwoEleGivenSumWithoutSort
{
    static void printpairs(int array[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < array.length; ++i) {
            int temp = sum - array[i];

            // checking for condition 
            if (s.contains(temp))
            {
                System.out.println("Pair with given sum " + sum + " is (" + array[i] + ", " + temp + ")");
                return;
            }

            s.add(array[i]);
        }
    }

    // Main to test the above function 
    public static void main(String[] args)
    {
        int array[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(array, n);
    }
} 