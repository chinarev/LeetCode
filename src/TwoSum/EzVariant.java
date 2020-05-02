package TwoSum;

public class EzVariant {
    public int[] twoSum(int[] nums, int target){
        int[] mass = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] + nums[j] == target) {
                    mass[0] = i;
                    mass[1] = j;
                    System.out.println(  mass[0] + " " + mass[1]  );
                    return mass;
                }

            }
        }
        return null;
    }
}
