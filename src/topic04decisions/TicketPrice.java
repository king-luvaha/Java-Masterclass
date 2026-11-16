package topic04decisions;

/*
1. Declare int age = 30;
2. Using an if/else if/else ladder, print the ticket category and price.
3. under 5 is free, 5 to 17 is a child (price 300)
4. 18 to 64 is an adult (price 600)
5. 65 or over is a senior (price 400)

1. Declare int day = 6;
2. (1 = Monday ... 7 = Sunday)
3. Use an arrow-form switch that prints Weekend for 6 and 7 and Weekday otherwise

1. Change age and day several times and check that each branch works,
including the edge value 4,5,17,18,64 and 65


 */

public class TicketPrice {
    static void main() {
        int age = 64;
        int day = 90;
        final int childPrice = 300;
        final int adultPrice = 600;
        final int seniorPrice = 400;

        if (age < 5) {
            System.out.println("Under 5 years old. Ticket is Free");
        } else if ( age < 18) {
            System.out.println("For a child. Ticket price is " + childPrice + "/.");
        } else if ( age < 65) {
            System.out.println("For an adult. Ticket price is " + adultPrice + "/.");
        } else {
            System.out.println("For a senior citizen. Ticket price is " + seniorPrice + "/.");
        }

        switch (day) {
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Weekday");
        }
    }
}
