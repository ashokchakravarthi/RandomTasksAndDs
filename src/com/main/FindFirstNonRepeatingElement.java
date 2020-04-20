import java.util.*;

class FindFirstNonRepeatingElement
{
    static int firstNonRepeating(int arr[], int n)
    {
        Map<Integer, Integer> valueCounterMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (valueCounterMap.containsKey(arr[i]))
            {
                valueCounterMap.put(arr[i], valueCounterMap.get(arr[i]) + 1);
            }
            else
            {
                valueCounterMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> x : valueCounterMap.entrySet())
        {
            if (x.getValue() == 1)
            {
                return x.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 7, 7, 4, 10, 11, 5, 10 };
        int n = arr.length;
        System.out.print(firstNonRepeating(arr, n));
    }
}