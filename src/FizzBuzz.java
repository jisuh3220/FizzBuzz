/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1; // Initialize the counter
        while (i < 100) { // Loop until i reaches 100

            i = dofizzbuzz(i);
        }
    }

    private static int dofizzbuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print the appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i++; // Increment the counter
        return i;
    }
}
