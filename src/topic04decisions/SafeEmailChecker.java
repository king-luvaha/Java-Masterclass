package topic04decisions;

/*
1. Clean the email with trim() and toLowerCase(), and find the position of @ with indexOf
2. Only if the email contains an @ and the @ is not at position 0 and it ends with ".com", print Valid email and the username.
Otherwise print Invalid email and extract nothing
 */

public class SafeEmailChecker {
    public static void main(String[] args) {
        String email = "";

        String trimmedEmail = email.trim().toLowerCase();
        System.out.println("Cleaned email:" + trimmedEmail);
        System.out.println("Length of the trimmed email: " + trimmedEmail.length());

        int atIndex = trimmedEmail.indexOf("@");
        System.out.println("The index of @: " + atIndex);

        // boolean containsAt = trimmedEmail.contains("@");
        boolean endsWithDotCom = trimmedEmail.endsWith(".com");

        boolean valid = atIndex >= 1 && endsWithDotCom;

        if(valid) {
            String username = trimmedEmail.substring(0, atIndex);
            System.out.println("Username: " + username);
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email!");
        }
    }
}
