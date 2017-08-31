package java8optional;

import java.util.Optional;

public class Java8Optional {
	
	public static void main(String[] args){
	
	String[] str=new String[10];
	
	str[5]="String value";
	
	Optional<String> opt=Optional.ofNullable(str[5]);
	

	if (opt.isPresent()) {
		
		String strLower=str[5].toLowerCase();
		System.out.println(strLower);
		
	}
	else {
		System.out.println("String is empty");
	}
	
	}
}
