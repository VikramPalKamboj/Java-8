package stramApi;
import java.util.stream.*;  


public class StreamIterating {
	public static void main(String[] args){
		 Stream.iterate(1, element->element+1)  
		 .filter(element->element%8==0)
		 .limit(7)
		 .forEach(System.out::println);
	}
}
