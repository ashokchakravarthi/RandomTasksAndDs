import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedBrackets
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String input = br.readLine();
        String openBraces = "[{(";
        String closeBraces = "]})";
        char[] charArray = input.toCharArray();
        char[] stack = new char[input.length()];
        int stackIndex=0;
        int matches = 0;
        boolean flag = true;
        for(int i=0; i<charArray.length; i++)
        {
            if(openBraces.contains(String.valueOf(charArray[i])))
            {
                stack[stackIndex] = closeBraces.charAt(openBraces.indexOf(charArray[i]));
                stackIndex++;
            }
            else if(closeBraces.contains(String.valueOf(charArray[i])))
            {
                if(stackIndex >= 1 && charArray[i] == stack[stackIndex-1])
                {
                    matches++;
                    stackIndex--;
                }
                else
                {
                    flag = false;
                }
            }
        }

        System.out.println((flag? "Yes": "No")+ " "+ matches);
    }
}
