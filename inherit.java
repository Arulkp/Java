class Product{
    void pro(int a,int b){
        System.out.println("2 varialble......");
    }
}
class Customer extends Product{
    void pro(int a,int b){
        System.out.println("3 variable..........");
        super.pro(2,3);
    }
}
class Order extends Customer{
     public static void main(String[] args){
      Order o = new Order();
      o.pro(1,2);

}
}