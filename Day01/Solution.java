class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];

        HashMap<Integer,Integer>hm=new HashMap<>();
        ans[0]=ans[1]=-1;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int needMore=target-num;
            if(hm.containsKey(needMore)){
                ans[0]=hm.get(needMore);
                ans[1]=i;

            }
            hm.put(nums[i],i);
        }
        return ans;
    }
}