//682. Baseball Game - LeetCode
//Time Complexity - O(n)
//Space Complexity - O(n)

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<operations.length; i++){
            String ch = operations[i];
            if(ch.equals("+")){
                int top = st.pop();
                int nTop = top +  st.peek();
                st.push(top);
                st.push(nTop);
            }
            else if(ch.equals("D")){
                st.push(st.peek()*2);
            }
            else if(ch.equals("C")){
                st.pop();
               
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        int ans=0;
        for(int ele : st){
            ans+=ele;
        }
        return ans;
    }
}
