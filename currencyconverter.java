import java.util.Scanner;

public class currencyconverter {

    // Function to simulate fetching currency exchange rates
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Hardcoded exchange rates (You should replace this with an API call to get real-time data)
        if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 83.00;  // Example: 1 USD = 83 INR
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return 0.012;  // Example: 1 INR = 0.012 USD
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.94;  // Example: 1 USD = 0.94 EUR
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.06;  // Example: 1 EUR = 1.06 USD
        }
        // Add more currency conversion rates as needed
        return 1.0;  // If same currency or unknown combination
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Selection
        System.out.println("Select base currency (e.g., USD, INR, EUR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Select target currency (e.g., USD, INR, EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Input amount to be converted
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Fetch the exchange rate
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        // Perform the currency conversion
        double convertedAmount = amount * exchangeRate;

        // Display result
        System.out.printf("%.2f %s is equal to %.2f %s.\n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}

    

