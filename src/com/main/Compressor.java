public class Compressor
{

    public String compressString(String data)
    {
        StringBuilder outBuilder = new StringBuilder();
        char prevChar = data.charAt(0);
        int counter = 0;
        char currChar;
        int length = data.length();
        for(int i=0; i<length; i++)
        {
            currChar = data.charAt(i);
            if(currChar == prevChar)
            {
                counter++;
                // For the last unique characters
                if(i == length-1)
                {
                    outBuilder.append(currChar);
                    outBuilder.append(counter);
                }

                continue;
            }
            else
            {
                outBuilder.append(prevChar);
                outBuilder.append(counter);
                prevChar = currChar;
                counter=1;
            }
        }

        return outBuilder.toString();
    }

    public static void main(String[] args)
    {
        Compressor compressor = new Compressor();
        System.out.println(compressor.compressString("aaabbbccddddef"));
    }
}

