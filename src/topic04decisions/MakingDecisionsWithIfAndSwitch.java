package topic04decisions;

public class MakingDecisionsWithIfAndSwitch {
    static void main() {
        int age = 18;
        int day = 76;

        if (age < 18) {
            System.out.println("Minor");    // runs only if age < 18
        } else if (age < 65) {
            System.out.println("Adult");    // runs if the first was false AND age < 65
        } else {
            System.out.println("Senior");
        }

        // Combining conditions
        boolean isStudent = true;
        if (age < 26 && isStudent) {   // both must be true
            System.out.println("Student discount");
        }
        if (age < 5 || age > 80) {    // at least one true
            System.out.println("Free entry");
        }

        // Common traps
        // 1) = assigns, == compares. In an if, Java rejects the assignment for ints:
        // if (age = 18) { }  // COMPILER ERROR
        if (age == 18) {
            System.out.println("You are now an adult. You can successfully obtain an ID!");
        }

        // 2) StringsL use .equals(), never ==
        String role = "admin";
        if (role.equals("admin")) {
            System.out.println("You are now an admin!");
        }

        // 3) Use braces { } even for on-line blocks. Without them, only the NEXT line belongs to if:
        if (age > 60)
            System.out.println("Discount");
            System.out.println("Always prints!");    // NOT part of the if, despite the indentation

        switch (day) {
            case 1 -> System.out.println("Born on a Monday");
            case 2 -> System.out.println("Christened on Tuesday");
            case 3 -> System.out.println("Married on Wednesday");
            case 4 -> System.out.println("Took ill on Thursday");
            case 5 -> System.out.println("Grew worse on Friday");
            case 6 -> System.out.println("Died on Saturday");
            case 7 -> System.out.println("Buried on Sunday");
            default -> System.out.println("That was the end, Of Solomon Grundy");  // runs if nothing matched
        }
    }
}


