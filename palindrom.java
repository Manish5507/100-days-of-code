public class palindrom {
    public static void main(String[] args) {
        
        int number = 12321;
        int originalNumber = number; // Store the original number for later comparison
        int reversedNumber = 0;
        
        // Loop to reverse the number
        while (number > 0) {
            // 1. Get the last digit using modulo
            int digit = number % 10;
            
            // 2. Append the digit to the reversed number
            reversedNumber = (reversedNumber * 10) + digit;
            
            // 3. Remove the last digit using division
            number = number / 10;
        }
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
        
        // Compare the original number with the reversed one
        if (originalNumber == reversedNumber) {
            System.out.println("Result: It's a palindrome! ✅");
        } else {
            System.out.println("Result: It's not a palindrome. ❌");
        }
    }
    
}
