package SplitandAdd.SplitandAdd;

import java.util.Scanner;
public class Implementation {

    // Method to sum character values and return the corresponding character
    public char splitAddAndReturnCharacter(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += (ch - 'a' + 1);  
        }
        
      
        int result = sum % 26;
        
        // Return '*' if result is 0
        if (result == 0) {
            return '*';
        } else {
            // Otherwise, return the corresponding character
            return (char) ('a' + result - 1);
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String input = scanner.nextLine();
        
        // Create an instance of Implementation class
        Implementation impl = new Implementation();
        char result = impl.splitAddAndReturnCharacter(input);
        System.out.println("The result character is: " + result);
        scanner.close();
    }
}


