package Sorting;
import java.util.Arrays;

/**
Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.

Example 1:

Input: n = 6
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation:
Minimum 3 platforms are required to
safely arrive and depart all trains.

<================================================ Implementation ========================================================>
Merge sort implementation, overlapping case

<================================================= Results =============================================================>
Expected Time Complexity: O(nLogn)
Expected Auxiliary Space: O(n)

**/


public class Problem_14_arrival_departure_merge_sort {


    static int findPlatform(int arr[], int dep[], int n)
    {
        int count = 1;
        int result = 1;
        int arrival = 1;
        int departure = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);

        while(departure < n && arrival < n){

            if (dep[departure] >= arr[arrival]){
                count++;
                arrival++;
            }
            else{
                count--;
                departure++;
            }
            result = Math.max(count,result);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arrival = {900,1000,1030};
        int[] departure = {1010,1020,1100};
        System.out.println(findPlatform(arrival,departure,3));
    }


}
