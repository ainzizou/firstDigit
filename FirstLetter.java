package firstletter;
import java.util.*;
public class FirstLetter {

    public static void main(String[] args) {
        int a; //declare the variable
        
        Scanner input = new Scanner(System.in);
        
        //Input from the user
        System.out.print("Please enter your number: ");
        a = input.nextInt();
        
        System.out.println("So the first digit of this '" +a+"' is: "+firstDigit(a));
    }//end main method
    
    public static int firstDigit(int n)
    {
        //Condition to determine the value 
       while (n < -9 || 9 < n) 
           n /= 10;
       return Math.abs(n); //Math absolute is used to round the value
    }//end First digit method
}
