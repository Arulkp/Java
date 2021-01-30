class Base{
    int data = 50;
    void d(Base b){
        System.out.println("Entered Change value"+data);
        b.data += b.data;

    }
}

class Run{
    public static void main(String[] args){
        Base b = new Base();
        System.out.println("Before Change value"+b.data);
        b.d(b);
        System.out.println("After Change value"+b.data);
    }

}