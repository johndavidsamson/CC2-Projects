package guessingnumber;
import java.util.Scanner;
public class GuessingNumber {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Input your desired number: ");
        String s = kb.next();
        
       
        int x = Integer.parseInt(s);
      
        System.out.println("Guess a number between 0-1000: ");
        int k = kb.nextInt();
        
        System.out.println("Hint:");
        
        if( x % 2 == 0){
            System.out.println("The number is even");
        }
        else{
        System.out.println("The number is odd");
        }
        
    do{
        if(k < x){
            System.out.println("Enter a Higher Value: ");
            k = kb.nextInt();
        }else if( k > x){
            System.out.println("Enter a Lower value: ");
            k = kb.nextInt();
        }
        
    }
        while( k != x);
             System.out.println("You guesed the correct answer");
    }
    
}
