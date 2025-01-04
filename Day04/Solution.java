class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean>ans=new ArrayList<>();

    int maxCandies=0;

    for(int e:candies){
        if(e>maxCandies){
            maxCandies=e;
        }
    }
    
    for(int candy:candies){

        if(candy+extraCandies>=maxCandies){
            ans.add(true);
        }
        else{
            ans.add(false);
        }

    }

return ans;
}
}