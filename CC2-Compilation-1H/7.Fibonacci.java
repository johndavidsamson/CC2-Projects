package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
       Scanner kb = new Scanner (System.in);
       
        display();
    }
   
    public static int users(){
    Scanner kb = new Scanner (System.in);
        
      System.out.println("Enter the desired number: ");
        int l = kb.nextInt();
        return l;
    }
    public static int fib(int kl){
       if(kl <= 1){
           return kl;
       }
       else{
           return fib(kl -1) + fib(kl - 2);
       }
    }   
   
  public  static void display(){
       int sum = users();
       
       
       for(int b = 0; b <= sum; b++){
               System.out.print("F" + b  + "\t");
           }
       System.out.println("");
      for( int y = 0; y <= sum ; y++){     
           
           for(int xb = 0; xb <= y ; xb++){
              
              System.out.print(fib(xb) + "\t");
       
           }
           
           System.out.println("");
       }
      
   }
}
