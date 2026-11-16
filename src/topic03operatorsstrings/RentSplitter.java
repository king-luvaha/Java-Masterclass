package topic03operatorsstrings;
/*
Four roommates share a flat. Declare int totalRent = 45000; and int roommates = 4;
1. Add a 2000 utility fee to totalRent using +=
2. Work out how much each person pays and how much is left over, using / and %
3. Print a line like Each pays 11750, leftover 0 (use your own numbers' results)
4. Print a second line that uses a comparison to say whether the leftover is zero, such as Splits evenly: true
 */
public class RentSplitter {
    public static void main(String[] args) {
        int totalRent = 45000;
        int roommates = 4;

        int utilityFee = 2000;
        int newTotalRent = totalRent += utilityFee;

        int eachPersonPays = newTotalRent / roommates;
        int leftOver = newTotalRent % roommates;

        System.out.println("Each pays: " + eachPersonPays + " , " + "Left over: " + leftOver);
        System.out.println("Splits evenly: " + (leftOver == 0));

        // System.out.println(newTotalRent);
    }
}
