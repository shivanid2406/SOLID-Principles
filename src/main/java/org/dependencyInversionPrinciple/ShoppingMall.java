package org.dependencyInversionPrinciple;

public class ShoppingMall {

    private Card card;

    public ShoppingMall(Card card) {
        this.card = card;
    }

    public void doPurchase(long amount){
        card.doTransaction(amount);
    }

    public static void main(String[] args){
        Card card = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(card);
        shoppingMall.doPurchase(1039493);

    }
}
