/*
 * PrimeNumbers.java
 * ForLoop Practice
 * Jess L
 * January 18th, 2018
 */
package primenumbers;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        num1 = input.nextInt();

        System.out.println("Enter a number");
        num2 = input.nextInt();
        System.out.println("These are the prime numbers");
        
        for (int i = num1; i < num2; i++) {
            boolean isPrime = isPrimeNum(i);

            if(isPrime) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNum( int num ) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }   
        }
        return true;
    }
    
}
