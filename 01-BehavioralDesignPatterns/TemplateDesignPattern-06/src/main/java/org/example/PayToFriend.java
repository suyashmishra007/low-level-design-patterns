package org.example;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        // specific validation for paytofriend flow
        System.out.println("Validate logic to paytofriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit the amount logic to paytofriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
