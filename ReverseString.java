public class ReverseString {
    public static void main(String[] args) {
        String original = "hello world";
        String reversed = "";

        for (int i= original.length() -1;i>=0;i--){
            reversed = reversed + original.charAt(i);

        }

        
        // Create a StringBuilder from the original string
        StringBuilder rs = new StringBuilder(original);
        
        // Reverse it and convert back to a String
        String result = rs.reverse().toString();


        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result); // Prints: dlrow olleh
        System.out.println(reversed);
    }
    
}
