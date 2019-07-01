import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Agents
{
    public static void main(String[] args)
    {
        List<List<Integer>> callsTimes = new ArrayList<>();
        Integer points[]= new Integer[]{1481122000, 1481122020, 1481122000, 1481122040, 1481122030, 1481122035, 1481122015, 1481122035};
        for(int i=0; i<9; i++)
        {
            List<Integer> dataPoints = new ArrayList<>();
            dataPoints.add(points[i++]);
            dataPoints.add(points[i]);
            callsTimes.add(dataPoints);
        }

        System.out.println(howManyAgentsToAdd(1, callsTimes));
    }

    public static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes)
    {
        Map<Integer, Integer> timeAgentNoMap = new HashMap<>();
        int agentNumber = 0;
        timeAgentNoMap.put(++agentNumber, callsTimes.get(0).get(1));
        for(int i=1; i<callsTimes.size(); i++)
        {
            Iterator iterator = timeAgentNoMap.entrySet().iterator();
            boolean satisfiedFlag = false;
            while (iterator.hasNext())
            {
                Map.Entry entryPair = (Map.Entry)iterator.next();
                Integer startTime = callsTimes.get(i).get(0);
                Integer endTime = callsTimes.get(i).get(1);
                if((Integer)entryPair.getValue() < startTime)
                {
                    timeAgentNoMap.put(agentNumber, endTime);
                    satisfiedFlag = true;
                    break;
                }
            }

            if(!satisfiedFlag)
            {
                timeAgentNoMap.put(++agentNumber, callsTimes.get(i).get(1));
            }
        }

        return --agentNumber;
    }
}
