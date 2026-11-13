package topic02variables;
/*

1. Compute totalPrice from pricePerSqm = 85000 and an area.
2. Compute deposit as 10% of it, using a final constant for the rate. Print both
3. Predict what int perFLoor = 7 / 2; prints, then change the code to print 3.5 correctly, and explain in a sentence why the fast version gave its result

 */

public class PriceCalculator {
    static void main() {
        double pricePerSqm = 85000.0;
        double area = 120.5;
        final double DEPOSIT_RATE = 0.10;

        double totalPrice = pricePerSqm * area;
        double deposit = totalPrice * DEPOSIT_RATE;

        System.out.printf("Total Price: %.2f%n", totalPrice);
        System.out.printf("Deposit: %.2f%n", deposit);

        // Per floor division line
        double perFloor = 7.0 / 2;
    }
}
