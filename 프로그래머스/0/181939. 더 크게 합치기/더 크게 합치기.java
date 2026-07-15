class Solution {
    public int solution(int a, int b) {
        int answer = 0;
       String a_b = (a+""+b);
       String b_a = (b+""+a);
        if(Integer.parseInt(a_b) > Integer.parseInt(b_a)){
             answer = Integer.parseInt(a_b);
        }else{
            answer = Integer.parseInt(b_a);
        }
        return answer;
    }
}