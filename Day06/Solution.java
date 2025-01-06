class Solution {
    public String reverseVowels(String s) {

    char str[]=s.toCharArray();
     int i=0;
     int j=str.length-1;

     while(i<j){
        if(isVowels(str[i]) && isVowels(str[j])){
            char swap=str[i];
            str[i]=str[j];
            str[j]=swap;
            i++;
            j--;
        }
       else{
        if (!isVowels(str[i])) i++;
    
        if (!isVowels(str[j])) j--;
        }
     }
    String ans = new String(str);
    return ans;

    }

    public boolean isVowels(char ch){
        if(ch=='a' || ch=='i' ||ch=='e' || ch=='o'|| ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' || ch=='U')return true;
        return false;
    }
}