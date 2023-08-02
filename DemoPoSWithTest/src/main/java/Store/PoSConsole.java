package Store;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class PoSConsole {

    RentSpec rentSpec;

    public PoSConsole() {
        this.rentSpec = new RentSpec();
    }

    public static void main(String[] args) {

        System.out.println("################ Store PoS Demo - Renting out Tools! ##################\n");

        String toolCode;
        String rentalDays;
        PoSConsole poSConsole = new PoSConsole();
        System.out.println("---- Checkout the Renting Tool ----");

        // User Input validation
        System.out.println("Enter Tool Code");
        Scanner scannerObj = new Scanner(System.in);
        while (true) {
            toolCode = scannerObj.nextLine();
            if (poSConsole.validateTool(toolCode) || toolCode.equalsIgnoreCase("X")) {
                break;
            }
            System.out.println("Wrong Tool Code Entered. Please Enter Correct Tool Code");
            System.out.println("Enter X to Exit");
        }
        if (toolCode.equalsIgnoreCase("x")) {
            System.out.println("Exiting...");
            System.exit(0);
        }

        int nRentalDays;
        System.out.println("Enter Number of Rental Days");
        while (true) {
            rentalDays = scannerObj.nextLine();
            nRentalDays = Integer.parseInt(rentalDays);
            if (nRentalDays > 0) {
                break;
            }
            System.out.println("Number of Days for Rental is invalid! Please enter a valid number");
        }

        int discountPercentage;
        System.out.println("Enter the discount in percentage");
        while (true) {
            discountPercentage = Integer.parseInt(scannerObj.nextLine());
            if (discountPercentage >= 0 && discountPercentage <= 100) {
                break;
            }
            System.out.println("Discount should be between 0% -100%! Please enter a valid discount");
        }

        String checkOutDate;
        System.out.print("Enter checkout date (MM/dd/yy): ");
        while (true) {
            checkOutDate = scannerObj.nextLine();
            if (isValidDateFormat(checkOutDate)) {
                break;
            } else {
                System.out.println("Invalid date format Entered. Please use the format MM/dd/yy");
            }
        }

        // Begin Checkout
        try {
            poSConsole.checkout(toolCode, checkOutDate, nRentalDays, discountPercentage);
        } catch (Exception e) {
            System.out.println("Console Error.. Try Again!!");
        }
    }

    // Support Methods
    private boolean validateTool(String toolCode) {
        return rentSpec.validateTool(toolCode);
    }

    public Boolean checkout(String toolCode, String checkoutDate, int rentalDays, int discountPercentage) {
        RentAgreementSpec rentAgreementSpec = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercentage);
        if (rentAgreementSpec.getAgreementStatus()) {
            System.out.println("*************** Rental Agreement ***************");
            System.out.println(rentAgreementSpec);
            System.out.println("Tool Checkout Success");
        } else {
            System.out.println("Tool Checkout Failed");
        }
        return true;
    }

    private static boolean isValidDateFormat(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        try {
            LocalDate startDate = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

}
