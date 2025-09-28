public class checkprime {
    public static void main(String[] args) {
        int num = 123; // The number to check
        boolean isPrime = true; // Flag to store the result

        // Prime numbers must be greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop to check for divisors
            for (int i = 2; i <= num / 2; i++) {
                // If num is divisible by any i, it's not prime
                if (num % i == 0) {
                    isPrime = false; // Set flag to false
                    break;           // Exit the loop early, no need to check further
                }
            }
        }

        // Print the final result based on the flag's value
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

