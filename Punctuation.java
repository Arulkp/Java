import java.util.*;
class punct{

	public static void main(String args[]){

			String s = "m1a@m";
			char[] out = new char[15];
			String out_new = "";
			int temp = 0;
			HashMap<Integer,Character> ht = new HashMap<Integer,Character>();
			for(int i=0;i<s.length();i++){
				if(!Character.isLetter(s.charAt(i))){
					ht.put(i,s.charAt(i));	
				}
			}
			for(int j=s.length()-1;j>=0;j--){
					if(ht.containsValue(s.charAt(j))){	
					 }
					else{
						out[temp]= s.charAt(j);
						temp++;	
					}		
			}
			for(int k=0;k<=out.length-1;k++){
				if(ht.containsKey(k)){
					for(int z = out.length-1;z>k;z--){
						out[z] = out[z-1];
					}
					out[k] = ht.get(k);
				}
				}
				System.out.println(out);
			
	}
}
