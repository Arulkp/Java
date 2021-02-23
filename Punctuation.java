import java.util.*;
class punct{

	public static void main(String args[]){

			String s = "houseno:123@cbe";
			String out="";
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
						temp++;
					 }
					else{
						out+= s.charAt(j);
					}		
			}
			for(int k=0;k<=out.length()-1+temp;k++){
				if(ht.containsKey(k)){
					
					out_new+= ht.get(k);
				}
					if(k<out.length()){
						out_new+= out.charAt(k);					
					}
					
				}
			


			System.out.println(out_new);
	}
}
