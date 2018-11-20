package arraytable;

import java.util.*;
public class ArrayTable {

    
    public static void main(String[] args ) {
        
        
        int [] a = {3,9,15,20,65,23,18,4,2,14,21};
        System.out.println("Elements: ");
        for(int c : a){
            System.out.println("\t" + c);
        }
        
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
         
        for(int b = 0; b < a.length; b++){
            if(a[b] % 2 == 0){
               even.add(a[b]);
                
            }
            else if(a[b] %2!= 0){
                odd.add(a[b]);   
            }
        }
         System.out.println("ODD \t EVEN");
        for(int c = 0; c < 5; c++){
            System.out.println(odd.get(c) + "\t" + even.get(c));
        }
        
    }   
    
}
