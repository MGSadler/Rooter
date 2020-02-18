/*Get a positive integer (i.e. any number greater than 0) called "start" from the user at the command line
and then find the square root of every number from "start" down through 0. Use a while loop to count down. 
As an example, if the user entered 8, you would find the square root of 8, then the square root of 7, and so on.

Print each square root on a separate line. Include data validation to ensure the user provides a positive integer. 
If the validation is not passed, provide the user with suitable feedback and stay in the program to let the user
try again until valid input is received. Use the Math.sqrt(double a) method to find each square root and output 
the integer and four decimal positions.
 */
package rooter;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Rooter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = -1;
        
        do{
            System.out.print("Please enter a positive number: ");
            if (input.hasNextInt()){
                start = input.nextInt();
            }
            else{
                System.out.println("Error!");
                input.nextLine();
            }
        }
        while (start <= 0);
        input.close();
        
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = start; i >= 0; i--)
        {
            System.out.println(df.format(Math.sqrt(i)));
        }
    }
    
}
