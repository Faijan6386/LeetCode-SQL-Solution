class Solution {
    public int[] diStringMatch(String s) {
        int n= s.length();
        int ans[] = new int[n+1];
        int l=0, h=n;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                ans[i]=l;
                l++;
            }else{
                ans[i]=h;
                h--;
            }
        }
        ans[n]=l;
        return ans; 
    }
}