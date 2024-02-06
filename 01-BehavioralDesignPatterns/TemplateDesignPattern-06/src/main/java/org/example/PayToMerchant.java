package org.example;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        // specific validation for paytofriend flow
        System.out.println("Validate logic to PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit the amount logic to PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }

}
