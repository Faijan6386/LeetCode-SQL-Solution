class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0, idx=0;
        while(i<n){
            char ch = chars[i];
            char current_char = ch;
            int count=0;
            while(i<n && current_char ==chars[i]){
                count++;
                i++;
            }
            chars[idx]=current_char;
            idx++;
            if(count>1){
                String sb = String.valueOf(count);
                for(char p: sb.toCharArray()){
                    chars[idx]=p;
                    idx++;
                }

            }
        }
        return idx;
        
    }
}
