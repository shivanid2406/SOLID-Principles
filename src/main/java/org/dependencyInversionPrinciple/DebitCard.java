package org.dependencyInversionPrinciple;

public class DebitCard implements Card{
    @Override
    public void doTransaction(long amount) {

    }

    public void doTransaction() {
        System.out.println("Payment using Debit Card");
    }


}
