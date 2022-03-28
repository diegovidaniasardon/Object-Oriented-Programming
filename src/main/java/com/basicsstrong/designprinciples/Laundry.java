package com.basicsstrong.designprinciples;



//Design principles
// Dry > Don’t repeat yourself - Don’t write duplicate code
public class Laundry {

    //single unambiguos authoritative representation


    public void washWhiteClothes(){
        //filling water to washing machine, setting configuration
        //System.out.println("Putting in white clothes");
        //draining out water

        performCommonTasks();
    }

    public void washColorClothes(){
        //filling water to washing machine, setting configuration
        //System.out.println("Putting in colorful clothes ");
        //draining out water

        performCommonTasks();
    }

    public void performCommonTasks(){
        //filling water to washing machine, setting configuration
        //draining out water

    }

}
