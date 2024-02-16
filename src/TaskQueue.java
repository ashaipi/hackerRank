package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task Queue
 * Task queues, which allow for asynchronous performance, are an important part of modern processing architectures. Information about a system consisting of several batch processing queues is given.
 *
 * Each queue has three parameters:
 *
 * the maximum number of tasks it can process in a single batch.
 * the time it takes to process a single batch of tasks in that queue
 * the number of tasks the queue must process
 *
 * Given this information. calculate the minimum time needed to process a set of tasks by the system.
 *
 * Example
 * n = 2
 * batchSize = [4,3]
 * processingTime = [6,5]
 * numTasks = [8,8]
 *
 * Queue 0 can process a max of 4 tasks in 6 minutes, and queue 1 can process a max of 3 tasks in 5 minutes. Each queue has 8 tasks to process. The time required to perform the assigned tasks in the minimu possible time is calculated as follows:
 *
 * For queue 0:
 *
 * At time = 0, a new batch of 4 tasks is initiated
 * At time = 6, the first batch of tasks is processed and a new batch of 4 tasks is initiated.
 * At time = 12, the second batch of tasks is processed. There are no more tasks left to process
 *
 * For queue 1:
 *
 * At time=0, a new batch of 3 tasks is initiated.
 * At time = 5, the first batch of tasks is processed and a new batch of 3 tasks is initiated
 * At time = 10, the second batch of tasks is processed and a new batch of 2 tasks is initiated.
 * The min time to process all tasks is 15
 *
 * Constraints:
 *
 * 1 <= n <= 10^5
 * 1 <= batchSize[i] <= 10^9
 * 1 <= processingTime[i] <= 10^5
 * 1 <= numTasks[i] <= 10^9
 */

public class TaskQueue {

    public static long minTime(List batchSize, List processingTime,List numTasks)
    {


        int n = batchSize.size();
        int maxTime = Integer.MIN_VALUE;

        System.out.println("Batch time :      "+batchSize);
        System.out.println("Processing time : "+processingTime);
        System.out.println("Num tasks :       "+numTasks);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" i - batch size  -  Processing time  -  number of tasks - t - Temp - Max time");
        for(int i=0;i<n;i ++)
        {
            int t = (int) numTasks.get(i) % (int) batchSize.get(i);
            int temp = (int) numTasks.get(i) / (int) batchSize.get(i) + (t == 0?0:1);
            maxTime = Math.max(maxTime, temp* (int) processingTime.get(i));
            System.out.printf("%2d     %3d               %3d                 %3d        %3d   %3d       %3d\n",i,batchSize.get(i),processingTime.get(i),numTasks.get(i), t,temp, maxTime);
        }
        System.out.println("-----------------------------------------------------------------------------");
        return maxTime;
    }



    public static void main(String[] args) {

        List<Integer> batchSize = new ArrayList<>(Arrays.asList(4,3));
        List<Integer> processingTime = new ArrayList<>(Arrays.asList(6,5));
        List<Integer> numTasks = new ArrayList<>(Arrays.asList(8,8));

        System.out.println("Max time : "+minTime(batchSize,processingTime,numTasks));

    }
}
