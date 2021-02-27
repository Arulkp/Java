import java.util.*;

class Solution{

static int i=0;
static int n[] = {1,1,2,2,3,3};

public static int[] removeDuplicates(){
			for(int j=1;j<n.length;j++){
				if(n[i] != n[j]){
					n[++i] = n[j];
				}
			}
			return n;
		}

public static void main(String args[]){
	System.out.println(Arrays.toString(removeDuplicates()));
	
}

}
