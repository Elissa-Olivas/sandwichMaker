package com.company;

public class Sandwich {
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public Sandwich(String bread, String protein, String cheese, boolean veggies) {
        breadType = bread;
        proteinType = protein;
        cheeseType = cheese;
        veggies = true;
    }
    public Sandwich (String protein, String cheese, boolean veg) {
        breadType = "whole Grain";
        proteinType = protein;
        cheeseType = cheese;
        veggies = veg;
    }


    public void setBreadType(String bread) {
        breadType = bread;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setProteinType(String protein) {
        proteinType = protein;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setCheeseType(String cheese) {
        cheeseType = cheese;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setVeggies(Boolean veg) {
        veggies = veg;
    }

    public boolean getVeggies() {
        return veggies;
    }
    //method for describing a sandwich

    public void describeSandwich() {
        System.out.println("This sandwich includes " + getBreadType() + " bread, " + getCheeseType() + " cheese, " + getProteinType() + " and has veggies: " + getVeggies() + ".");
    }
}
