package TwoSum;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simple variant: ");
        EzVariant ezVariant = new EzVariant();
        int[] arr = new int[]{1, 7, 9, 3};
        int target = 16;
        ezVariant.twoSum(arr, target);

        System.out.println("Hash Map variant: ");
        HashMapVariant hashMapVariant = new HashMapVariant();
        hashMapVariant.twoSum(arr, target);

    }


}
