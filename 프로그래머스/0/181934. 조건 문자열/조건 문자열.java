class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String answer = ineq+eq;
        switch(answer){
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
            default:
                return 0;            
        }
    }
}