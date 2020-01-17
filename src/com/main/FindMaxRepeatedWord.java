import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class FindMaxRepeatedWord
{
    public static void main(String[] args)
    {
        findMostFrequentlyUsedWord();
    }

    public static void findMostFrequentlyUsedWord()
    {
        int maxCount = 0;
        int limit =3;
        ArrayList<String> maxRepeatedWords = new ArrayList<>();
        try
        {
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Map wordVsCountMap = new HashMap<String, Integer>();
            String line;

            while((line = br.readLine())!= null)
            {
                String[] lineWords = line.split(" ");
                if(lineWords != null)
                {
                    for(String word: lineWords)
                    {
                        if(wordVsCountMap.get(word) != null)
                        {
                            int count = (Integer) wordVsCountMap.get(word);
                            wordVsCountMap.put(word, ++count);
                            if(count > maxCount)
                            {
                                maxCount = count;
                            }
                        }
                        else
                        {
                            wordVsCountMap.put(word, 1);
                        }
                    }
                }
            }


        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


        for(String maxRepeatedWord: maxRepeatedWords)
        {
            System.out.println(maxRepeatedWord + ": " + maxCount);
        }
    }
}
