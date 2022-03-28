package com.basicsstrong.designprinciples.LSP;

class Purchase {
     public void makePurchase(){
         System.out.println("Simple purchase");
     }
}
class PurchaseDiscount extends Purchase{
    public void makePurchase(){
        System.out.println("Discount purchase");
    }
}

class UserPurchase extends Purchase{

}

class UserDiscountPurchase extends PurchaseDiscount{

}


public class LSPExe2 {
    public static void main(String[] args) {

        UserPurchase userPurchase = new UserPurchase();
        userPurchase.makePurchase();

        UserDiscountPurchase userDiscountPurchase = new UserDiscountPurchase();
        userDiscountPurchase.makePurchase();

    }
}
