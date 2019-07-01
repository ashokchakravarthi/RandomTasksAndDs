import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cells
{
    public static void main(String args[])
    {
        int states[] = {1,1,1,0,1,1,1,1};
        System.out.println(cellCompete(states, 2));

    }

    public static List<Integer> cellCompete(int[] states, int days)
    {
        int n= states.length;
        int newStates[] = new int[n];
        for(int processingDay = 1; processingDay <= days; processingDay++)
        {
            for(int i=0; i<n; i++)
            {
                if(i==0)
                {
                    newStates[i] = 0 ^ states[i+1];
                }
                else if(i == n-1)
                {
                    newStates[i] = states[i-1] ^ 0;
                }
                else
                {
                    newStates[i] = states[i-1] ^ states[i+1];
                }
            }

            for(int i=0; i<n; i++)
            {
                states[i] = newStates[i];
            }
        }

        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }
}
