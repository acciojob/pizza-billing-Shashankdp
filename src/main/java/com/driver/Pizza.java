package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheese;

    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;

    boolean isAddtakeAway;

    boolean isgetBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isAddtakeAway=false;
        this.isgetBill=false;
        this.bill="";
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.Cheese=80;

        this.bill += "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            this.price += Cheese;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            this.price += toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isAddtakeAway) {
            this.price += 20;
            isAddtakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isgetBill) {
            if(isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: "+this.Cheese +"\n";
            }
            if(isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isAddtakeAway) {
                this.bill += "Paperbag Added: "+"20"+"\n";
            }

            this.bill+="Total Price: "+this.price+"\n";
            isgetBill=true;
        }
        return this.bill;
    }
}
