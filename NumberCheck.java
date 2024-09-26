package assignment26;
import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        if (!(number >= 10 && number <= 20)) {
            System.out.println(number + " is NOT between 10 and 20 ");
        } else {
            System.out.println(number + " is between 10 and 20 ");
        }

    }
}






