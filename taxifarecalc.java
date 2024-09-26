import java.util.Scanner;

public class taxifarecalc {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input taxi number
        System.out.print("Enter the Taxi No.: ");
        String taxiNo = scanner.nextLine();
        
        // Input distance covered by the passenger
        System.out.print("Enter the distance covered (in km): ");
        int distance = scanner.nextInt();

        // Variable to store total amount
        int amount = calculateFare(distance);

        // Print the bill
        System.out.println("\n*** Pre-Paid Taxi Bill ***");
        System.out.println("Taxi No.: " + taxiNo);
        System.out.println("Distance covered: " + distance + " km");
        System.out.println("Total Amount: ₹ " + amount);

        // Close the scanner
        scanner.close();
    }

    public static int calculateFare(int distance) {
        int amount = 0;
        if(distance <=5) {
            amount = 100; //Flat rate upto 5 kms
        }
        else if(distance <= 15) {
            amount = 100 + (distance - 5) * 10; //Flat rate upto 5 kms + Fare for the next 10 kms
        }
        else if(distance <=25) {
            amount = 100 + 10*10 + (distance - 15) * 8; //Flat rate upto 5 kms + 10 kms at 10/km + 10 kms at 8/km
        }
        else if(distance > 25) {
            amount = 100 + 10*10 + 10*8 + (distance - 25) * 5; 
        }
        return amount;
    }
}




