import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATMMoneyDenominations
{
    private static int[] values = {2000, 500, 200, 100};
    private static int[] amounts = {10,10,10,10,10};
    public static void main(String[] args)
    {
        List<Integer[]> results = solutions(new int[4], 700, 0);
        for (Integer[] result : results)
        {
            System.out.println(Arrays.toString(result));
        }
    }

    public static List<Integer[]> solutions(int[] variation, int price, int position)
    {
        List<Integer[]> list = new ArrayList<>();
        int value = compute(variation);
        if (value < price)
        {
            for (int i = position; i < values.length; i++)
            {
                if (amounts[i] > variation[i])
                {
                    int[] newvariation = variation.clone();
                    newvariation[i]++;
                    List<Integer[]> newList = solutions(newvariation, price, i);
                    if (newList != null)
                    {
                        list.addAll(newList);
                    }
                }
            }
        }
        else if (value == price)
        {
            list.add(myCopy(variation));
        }

        return list;
    }

    public static int compute(int[] variation)
    {
        int ret = 0;
        for (int i = 0; i < variation.length; i++)
        {
            ret += values[i] * variation[i];
        }

        return ret;
    }

    public static Integer[] myCopy(int[] ar)
    {
        Integer[] ret = new Integer[ar.length];
        for (int i = 0; i < ar.length; i++)
        {
            ret[i] = ar[i];
        }

        return ret;
    }
}
