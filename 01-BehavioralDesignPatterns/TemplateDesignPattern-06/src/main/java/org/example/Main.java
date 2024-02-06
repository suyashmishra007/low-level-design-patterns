package org.example;

public class Main {
    /*
     Why its required and when to use :
     -> when you want all classes to follow the specific steps to process the task but also need to provide the flexibility that each class can have their own logic in that specific steps.
    */
    public static void main(String[] args) {
        PaymentFlow pay = new PayToFriend();
        pay.sendMoney();

        PaymentFlow pay1= new PayToMerchant();
        pay1.sendMoney();
    }
}