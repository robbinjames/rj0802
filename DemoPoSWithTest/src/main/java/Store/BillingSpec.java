package Store;

import java.math.BigDecimal;

public class BillingSpec {

    BigDecimal toolDailyPrice;
    BigDecimal toolFinalPrice;
    int rentalDays;
    double discountPercentage;

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    BigDecimal discountAmount;
    BigDecimal priceBeforeDicount;

    public BigDecimal getPriceBeforeDicount() {
        return priceBeforeDicount;
    }

    public  BillingSpec(BigDecimal toolDailyPrice, int rentalDays, double discountPercentage){
        this.toolDailyPrice = toolDailyPrice;
        this.rentalDays = rentalDays;
        this.discountPercentage = discountPercentage;
    }

    public BigDecimal calculateRentalPrice(){

        System.out.println(discountPercentage);
        System.out.println(rentalDays);
        double multiplier = rentalDays * (discountPercentage/100);

        priceBeforeDicount = toolDailyPrice.multiply(BigDecimal.valueOf(rentalDays));
        discountAmount = toolDailyPrice.multiply(BigDecimal.valueOf(multiplier));

        toolFinalPrice = priceBeforeDicount.subtract(discountAmount);
        return toolFinalPrice;

    }
}
