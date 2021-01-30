
import java.io.*;
import java.util.*;

class Dict {
    public static void main(String args[]){
        Hashtable<Integer,String> h1 = new Hashtable<>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"D");
        h1.put(5,"E");
        Enumeration name;
        name = h1.keys();
        while(name.hasMoreElements()){
              System.out.println(name.nextElement());
        }


    }


}