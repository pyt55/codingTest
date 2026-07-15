class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char current = code.charAt(idx);
            
            if (current == '1') {
                mode = 1 - mode; 
            } 
            
            else {
                if (mode == 0 && idx % 2 == 0) {
                    sb.append(current);
                } else if (mode == 1 && idx % 2 != 0) {
                    sb.append(current);
                }
            }
        }
    
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}