import java.util.*;
public class Check{
        public static void toppush(int k ,Stack<Integer> st){
        if(st.size()==0){
            st.push(k);
            return;
        }
        int l = st.pop();
        toppush(k,st);
        st.push(l);
        return;
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        int k= 4;
        toppush(k,st);
        System.out.println(st.size());
        for(int i:st){
            System.out.println(i);
        }
    }

}