package topic03operatorsstrings;

/*
Start with String email = "  Amina.K@Example.com ";
1. Clean it with trim() and toLowerCase(), storing the result in a new variable
2. Print its length
3. Using indexOf("@") and substring, extract the part before the @ and print it as the username
4. Create a boolean valid that is true only if the cleaned email contains "@" and ends with ".com" (look up the endsWith method). Print it
5. Print whether the username equals "amina.k"

 */

public class EmailChecker {
    public static void main(String[] args) {
        String email = "  Amina.K@Example.com ";

        String trimmedEmail = email.trim().toLowerCase();
        System.out.println("Cleaned email:" + trimmedEmail);
        System.out.println("Length of the trimmed email: " + trimmedEmail.length());

        int atIndex = trimmedEmail.indexOf("@");
        System.out.println("The index of @: " + atIndex);

        String username = trimmedEmail.substring(0, atIndex);
        System.out.println("Username: " + username);

        boolean containsAt = trimmedEmail.contains("@");
        boolean endsWithDotCom = trimmedEmail.endsWith(".com");

        boolean valid = containsAt && endsWithDotCom;

        System.out.println("Valid email: " + valid);

        System.out.println("Username equals amina.k: " + username.equals("amina.k"));

    }
}
