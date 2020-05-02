package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class HashMapVariant {
    public int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            myMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (myMap.containsKey(complement) && myMap.get(complement) != i){
                System.out.println(i + " " + myMap.get(complement));
                return new int[]{i, myMap.get(complement)};
            }
        }

        return null;


    }
}
