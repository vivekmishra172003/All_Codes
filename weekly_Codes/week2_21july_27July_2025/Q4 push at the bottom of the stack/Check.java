public // User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(!st.isEmpty()){
            arr.add(st.pop());
        }
        st.push(x);
        for(int i=arr.size()-1;i>=0;i--){
            st.push(arr.get(i));
        }
        
        return st;
    }
} Check {
    
}
