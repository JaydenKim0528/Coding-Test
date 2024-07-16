class Solution {
    public String solution(String my_string) {
        String answer = "";
        int number = my_string.length();
        
        for(int i = number-1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}