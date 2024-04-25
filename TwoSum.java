import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // Initially I create an array of integers of length 2 as it will hold only 2 values
        int result[] = new int[2];

        /* I then create a map with the idea of storing as a key the value of the number in nums
           and as a value its index
         */
        HashMap<Integer,Integer> numMap = new HashMap<>();

        // I then create a loop that starts from the first element in nums and end with the last one
        for(int i = 0; i < nums.length; i++) {

            // Here I calculate the difference between the target and the current number
            int difference = target - nums[i];

            /* Here I check if the map already contains the difference then I add its value(index) and the current value of i to the result array
            as this means that we've found the 2 elements which sum equals to target.
            Otherwise, if the difference is not contained I will insert its value in the map as a Key and its index as a value.
            */
            if(numMap.containsKey(difference)) {
                result[0] = numMap.get(difference);
                result[1] = i;
            } else {
                numMap.put(nums[i], i);
            }
        }
        // Finally I return the result array
        return result;
    }
}
