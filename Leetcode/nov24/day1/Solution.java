class Solution {
    public String makeFancyString(String s) {
        // step 1: convert string to string builder
        StringBuilder sb = new StringBuilder(s);
        // step2: three  consecatived ke liye  hum agar middle  ke  ider uder same string hogi  to middle string ko hum remove kar skate hai  

        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i-1)==sb.charAt(i)&& sb.charAt(i) ==sb.charAt(i+1)){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
//1957 string