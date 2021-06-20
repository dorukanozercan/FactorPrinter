public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factors = 1;
        while (factors <= number) {
            if (number % factors == 0) {
                System.out.println(factors);
            }
            factors++;
        }
    }

}
