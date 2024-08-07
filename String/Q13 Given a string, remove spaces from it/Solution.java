

//User function Template for Java
class Solution
{
   
    String modify(String S)
    {
        // your code here
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<S.length();i++){
            if(S.charAt(i) != ' '){
                sb.append(S.charAt(i));   
            }
        }
        return sb.toString();
    }
}