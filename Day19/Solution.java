class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int ans[]=new int[gain.length+1];
        ans[0]=0;
        int add=0;
        for(int i=0;i<gain.length;i++){
            add+=gain[i];
            ans[i+1]=add;
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i]>max)max=ans[i];
        }
        return max;
    }
}