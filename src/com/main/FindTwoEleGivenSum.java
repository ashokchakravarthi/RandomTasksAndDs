import java.util.*;

class FindTwoEleGivenSum {
    // Function to check if array has 2 elements
    // whose sum is equal to the given value
    static boolean hasArrayTwoCandidates(int array[], int array_size, int sum)
    {
        int l, r;

        /* Sort the elements */
        Arrays.sort(array);

        /* Now look for the two candidates
        in the sorted array*/
        l = 0;
        r = array_size - 1;
        while (l < r)
        {
            if (array[l] + array[r] == sum)
                return true;
            else if (array[l] + array[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }

        return false;
    }

    // Driver code
    public static void main(String args[])
    {
        int array[] = { 1, 4, 45, 6, 10, -8 };
        int sum = 16;
        int array_size = array.length;

        // Function calling
        if (hasArrayTwoCandidates(array, array_size, sum))
            System.out.println("Array has two elements with given sum");
        else
            System.out.println("Array doesn't have two elements with given sum");
    }
}