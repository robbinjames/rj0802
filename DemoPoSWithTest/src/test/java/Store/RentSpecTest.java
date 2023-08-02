package Store;

import static junit.framework.TestCase.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RentSpecTest {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");

    @Test
    void testScenario1() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "JAKR";
        int rentalDays = 5;
        String checkoutDate = "09/03/15";
        double discountPercent = 101;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }


    }

    @Test
    void testScenario2() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "LADW";
        int rentalDays = 3;
        String checkoutDate = "07/02/20";
        double discountPercent = 10;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }
    }

    @Test
    void testScenario3() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "CHNS";
        int rentalDays = 5;
        String checkoutDate = "07/02/15";
        double discountPercent = 25;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }
    }

    @Test
    void testScenario4() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "JAKD";
        int rentalDays = 6;
        String checkoutDate = "09/03/15";
        double discountPercent = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }
    }

    @Test
    void testScenario5() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "JAKR";
        int rentalDays = 9;
        String checkoutDate = "07/02/15";
        double discountPercent = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }
    }

    @Test
    void testScenario6() {
        RentSpec rentSpec = new RentSpec();
        String toolCode = "JAKR";
        int rentalDays = 4;
        String checkoutDate = "07/02/20";
        double discountPercent = 50;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate startDate = LocalDate.parse(checkoutDate, formatter);

        RentAgreementSpec rentalAgreement = rentSpec.checkout(toolCode, checkoutDate, rentalDays, discountPercent);

        if(rentalAgreement.getAgreementStatus()){
            System.out.println( "Tool Code - " + rentalAgreement.getToolCode());
            assertEquals(toolCode, rentalAgreement.getToolCode());

            System.out.println( "Tool Code - " + rentalAgreement.getRentalDays());
            assertEquals( rentalDays, rentalAgreement.getRentalDays());

            System.out.println( "Tool Code - " + rentalAgreement.getCheckoutDate());
            assertEquals( startDate, rentalAgreement.getCheckoutDate());

            System.out.println( "Tool Code - " + rentalAgreement.getDiscountPercent());
            assertEquals( discountPercent, rentalAgreement.getDiscountPercent());
        }
        else{
            assertEquals( false, rentalAgreement.getAgreementStatus());
        }
    }
}
