package Arrays;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class HashingConcept {
    public static void main(String[] args) {
        MyHashSet hashset = new MyHashSet();

        hashset.add(0);
        hashset.add(9);

        System.out.println(hashset.contains(9));
        System.out.println(hashset.contains(3));

        hashset.add(9);
        hashset.add(4);
        hashset.add(10);
        System.out.println(hashset.contains(2));
        System.out.println(hashset.contains(0));

        hashset.remove(3);
        System.out.println(hashset.contains(3));
    }
    public static class MyHashSet{
        private final int SIZE=1000;//no. of buckets
        private List<Integer>[] buckets;//array of buckets

        public MyHashSet(){
        buckets = new LinkedList[SIZE];//initially all buckets are null
        }

        private int hash(int key){//hashing function
            return key%SIZE;//converts data into buckets index
        }

        public void add(int key){
            int idx = hash(key);
            if(buckets[idx]==null){
                buckets[idx]=new LinkedList<>();
            }
            if(!buckets[idx].contains(key)){
                buckets[idx].add(key);
            }
        }

        public void remove(int key){
            int idx = hash(key);
            if(buckets[idx]!=null){
                buckets[idx].remove((Integer) key);
            }
        }

        public boolean contains(int key){
            int idx = hash(key);
            return buckets[idx] != null && buckets[idx].contains(key);
        }

        /*
        LeetCode : 705 (Design Hashset)
         */


    }
}
