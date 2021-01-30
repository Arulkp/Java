abstract class master{
    void sale_order(){
        System.out.println("Sale Order Is Confirmed......");
    }
    void delivery_order(){
        System.out.println("Delivery Order is Validated......");
    }
    void account_invoice(){
        System.out.println("Account Invoice is Created.......");
    }
}


class Bala extends master{
    void sale_order(){
        System.out.println("Sale Order is Confirmed By Bala.........");
    }
    void delivery_order(){
        System.out.println("Delivery Order is Validated By Bala..........");
    }
}

class Abi extends Bala{
    public static void main(String[] args){
        master m = new Bala();
        m.sale_order();
        m.delivery_order();
        m.account_invoice();
    }
}