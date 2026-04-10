//Alternate Positive Negative -- GFG
//Time Complexity = O(n) 
//Space Complexity = O(n)

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int size = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0; i<size; i++){
            if(arr.get(i) >=0) pos.add(arr.get(i));
            else neg.add(arr.get(i));
        }
        
        int i=0, p=0, n=0;
        
        while(p < pos.size() && n < neg.size()){
            if(i%2==0){
                arr.set(i++, pos.get(p++));
            }
            else{
                arr.set(i++, neg.get(n++));
            }
        }
        
        while(p < pos.size()){
            arr.set(i++, pos.get(p++));
        }
        while(n < neg.size()){
            arr.set(i++, neg.get(n++));
        }
    }
}
