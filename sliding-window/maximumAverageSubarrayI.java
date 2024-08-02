public class maximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int sum = 0;
        double finalSum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        finalSum = sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            if(sum>finalSum){
                finalSum= sum;
            }
        }
        System.out.println(finalSum/k);
    }
}
