class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        int i = 0; //start
        int j = 0; //end
        StringBuilder ans = new StringBuilder();

        while(i < start.length() && j < end.length()){
            if(start.charAt(i) == end.charAt(j)){
                ans.append(start.charAt(i));
                i++;
                j++;
            }else{
                break;
            }
        }

        return ans.toString();
    }
}