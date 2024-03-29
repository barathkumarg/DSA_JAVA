package Bitwise_operations;
/*
Given an array of N positive elements, the task is to find the maximum AND value generated by any pair of elements from the array.

Input: arr1[] = {16, 12, 8, 4}
Output: 8
Explanation: 8 AND12 will give us the maximum value 8

Input: arr1[] = {4, 8, 16, 2}
Output: 0

Time Complexity: O(N*log(M)) where M is the maximum element from the array and N is the size of the array.
Auxiliary Space: O(1)
*/
public class Problem_4_maximum_AND_in_two_pairs_array {

    public static void main(String[] args) {

        int[] array = {19,17,12,8,4,1};
        int final_result = 0;


        //iterate from MSB to found the highest number
        for (int i=31;i>=0;i--){
            int count = 0;
            int high_bit_value = final_result | (1<<i);

            //iterate over the array
            for (int j=0;j<array.length;j++){
                if(high_bit_value == (high_bit_value & array[j]))
                    count++;

                //add the remaining bit if the higher order bit are matched
                if (count>=2)
                    final_result = (final_result | high_bit_value);
            }
        }
        System.out.println(final_result);
    }



}