 class DupFromSortArray {
    
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;


                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        
        DupFromSortArray obj = new DupFromSortArray();

        int nums[] = {1,1,1,2,2,3,3,4,4,4};

        int newLength= obj.removeDuplicates(nums);

        System.out.println("New length After Removing :"+ newLength);

        System.out.print("Array after remove Duplicate :");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}
