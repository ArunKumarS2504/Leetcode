// Given an integer array nums and an integer val, remove all occurrences of val 
//in nums in-place. The order of the elements may be changed. Then return 
//the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to 
//get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the 
//elements which are not equal to val. The remaining elements of nums are not 
//important as well as the size of nums.
// Return k.
 
 
 class RemoveElement {
    
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
 
    }
    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();

        int nums[] = {3, 2, 2, 3};
        int val = 3;

        int newLength = obj.removeElement(nums, val);

        System.out.println("New length after removing elements equal to " + val + ": " + newLength);

        System.out.print("Array after removing elements equal to " + val + ": ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}