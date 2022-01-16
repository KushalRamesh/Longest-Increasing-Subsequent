import java.util.ArrayList;
import java.util.Iterator;
 
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int array[] = {10, 9, 8, 6, 5, 4};
        ArrayList list = new ArrayList();
        ArrayList longestList = new ArrayList();
        int currentMax;
        int highestCount = 0;
        for(int i = 0; i < array.length;i++)
        {
            currentMax = Integer.MIN_VALUE;
            for(int j = i;j < array.length; j++)
            {
                if(array[j] > currentMax)
                {
                    list.add(array[j]);
                    currentMax = array[j];
                }
            }
            if(highestCount < list.size())
            {
                highestCount = list.size();
                longestList = new ArrayList(list); 
            }  
            list.clear();
        }
        System.out.println();
        Iterator itr = longestList.iterator();
        System.out.print("The Longest subsequence is: ");
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Length of Longest Increasing Subsequence is: " + highestCount);
    }
     }