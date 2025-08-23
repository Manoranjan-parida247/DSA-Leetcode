class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end)
        {
            if(!isVowel(ch[start]))
            {
                start ++;
            }else if(!isVowel(ch[end]))
            {
                end --;
            }else{
                char temp = ch[start];
                ch [start] = ch[end];
                ch[end] = temp;
                start ++;
                end --;
            } 
        }
        return String.valueOf(ch);
        
    }
    public static boolean isVowel(char s)
    {
       if((s=='A' || s=='a' || s=='E' || s=='e' || s=='I' || s=='i' || s=='O' || s=='o' || s=='U' || s=='u'))
       {
        return true;
       }
       return false;
    }
    
}