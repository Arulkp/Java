import java.io.*;
import java.util.*;

class Count{

public static void main(String args[]){
    String s ="aaabbbbccccccd";
    String out = "";
    HashMap<Character, Integer> h = new HashMap<Character, Integer>();
    for (int i=0;i<s.length();i++){
        if(h.containsKey(s.charAt(i))){
            h.put(s.charAt(i),h.get(s.charAt(i))+1);
        }
        else{
            h.put(s.charAt(i),1);
        }
    }
    for(Map.Entry e:h.entrySet()){
                out +=  String.valueOf(e.getKey()) + String.valueOf(e.getValue());
    }
     System.out.println(out);




}
}