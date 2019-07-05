import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowSlide
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String windowAndLimit = br.readLine();
        String windowAndLimitArray[] = windowAndLimit.split(" ");
        int window = Integer.parseInt(windowAndLimitArray[0]);
        int length = Integer.parseInt(windowAndLimitArray[1]);
        String array = br.readLine();
        String[] arrayElements = array.split(" ");
        windowSlide(arrayElements, window, length);
    }

    static void windowSlide(String[] arrayElements, int window, int length)
    {
        int[] arrayElementsInt = new int[length];
        for(int i=0; i<length; i++)
        {
            arrayElementsInt[i] = Integer.parseInt(arrayElements[i]);
        }

        for(int i=0; i+window-1<length; i++)
        {
            int output = arrayElementsInt[i];
            for(int j=i+1; j < i+window; j++)
            {
                if(arrayElementsInt[j] > output)
                {
                    output = arrayElementsInt[j];
                }
            }

            System.out.print(output+ ""+ ((i+window-2<length) ? " " : ""));
        }
    }
}
