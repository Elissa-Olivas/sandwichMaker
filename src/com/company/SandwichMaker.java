package com.company;

public class SandwichMaker {

    public static void main(String[] args) {
	Sandwich mySandwich = new Sandwich("white", "pepperoni", "provolone", true);
    Sandwich italian = new Sandwich("italian", "pepperoni", "mozzerella", false);

    mySandwich.describeSandwich();
    italian.describeSandwich();
    }
}
