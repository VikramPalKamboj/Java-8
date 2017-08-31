package StringJoiner;

import java.util.StringJoiner;

public class StringJoiners {


	public static void main(String[] args){
		 StringJoiner strs = new StringJoiner(",","[","}");
		 
		 strs.add("vikram");
		 strs.add("rakesh");
		 strs.add("OkkeSeller");
		 strs.add("gmail");
		 
		 System.out.println(strs);
		 
		
		 StringJoiner strs2 = new StringJoiner(":", "[", "]");  
		 
	        strs2.add("Peter");  
	        strs2.add("Raheem");  
	  
	        StringJoiner merge = strs.merge(strs2);  
	        
	        System.out.println(merge);
	}
}
