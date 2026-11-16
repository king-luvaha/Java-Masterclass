package topic03operatorsstrings;

public class OperatorsStrings {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        int total = 100;
        int bedrooms = 3;

        double price = 90000;
        boolean available = true;

        String name = "  Sky Apartments ";

        String y = "yes";
        String z = "yes";

        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // multiplication
        System.out.println(a / b); // Integer division ( decimals dropped, as in Topic 2)
        System.out.println(a % b); // modulus: the REMAINDER after dividing

        // Shortcuts for updating a variable
        /*
        int total = 100;
        total += 20;    // same as total = total + 20;  -> 120
        total -= 10;    // -> 110
        total *= 2;     // -> 220
        total++;        // add 1 -> 221
        total--;        // subtract 1 -> 220
         */

        // Comparison operators
        System.out.println(bedrooms == 3); // true
        System.out.println(bedrooms != 3); // false
        System.out.println(bedrooms > 2);  // true
        System.out.println(bedrooms <= 2);  // false

        // Logical operators (combine booleans)
        boolean canBuy = price < 100000 && available; // && means AND: both must be true
        System.out.println(canBuy);

        boolean either = price < 50000 || available; // || means OR: at least one true
        System.out.println(either);

        boolean notAvailable = !available;  // means NOT: flips true/false
        System.out.println(notAvailable);

        // Strings
        System.out.println(name.length());  // 17 (counts spaces too)
        String clean = name.trim();    // removes spaces at both ends -> "Sky Apartments"
        System.out.println(clean);
        System.out.println(clean.toUpperCase());  // SKY APARTMENTS
        System.out.println(clean.charAt(4));
        System.out.println(clean.indexOf("Apart")); // Position where "Apart" starts; -1 if absent
        System.out.println(clean.substring(0, 3));  // Sky (from position 0 up to, NOT including, 3)
        System.out.println(clean.contains("Sky"));
        System.out.println(clean.replace("Sky", "Sea"));

        // Comparing strings : use .equals() not ==
        System.out.println(y.equals(z));    // true: compares the TEXT
        System.out.println("YES".equalsIgnoreCase(z));

        // Formatting numbers
        double result = 102452500;
        System.out.printf("Price: %.2f%n", result);
    }
}
