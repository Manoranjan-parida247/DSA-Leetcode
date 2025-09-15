class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        HashSet<Character> brokenLettersSet = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            brokenLettersSet.add(ch);
        }

        String[] str = text.split(" ");

        int count = 0;

        for(int i = 0; i < str.length; i++){
            String currWord = str[i];

            for(char ch : currWord.toCharArray()){
                if(brokenLettersSet.contains(ch)){
                    count++;
                    break;
                }
            }
        }

        return str.length - count;
    }
}