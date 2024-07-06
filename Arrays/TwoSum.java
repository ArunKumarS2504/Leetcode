import java.util.HashMap;

class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            HashMap<Integer,Integer> sol = new HashMap();
            for(int i=0;i<nums.length;i++){
                int complement = target- nums[i];

                if(sol.containsKey(complement))
                    return new int[] {sol.get(complement),i};
                sol.put(nums[i],i);
            }
            return null;
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        int nums[] = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}