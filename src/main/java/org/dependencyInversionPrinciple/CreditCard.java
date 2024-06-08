package org.dependencyInversionPrinciple;

public class CreditCard implements Card{
    @Override
    public void doTransaction(long amount) {

    }

    public void doTransaction() {
        System.out.println("Payment using Credit Card");
    }
}
