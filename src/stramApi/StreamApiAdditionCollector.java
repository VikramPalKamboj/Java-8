package stramApi;

import java.util.*;  
import java.util.stream.Collectors;
class Prods{  
    int id;  
    String name;  
    float price;  
    public Prods(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamApiAdditionCollector {  
    public static void main(String[] args) { 
    	
        List<Prods> productsList = new ArrayList<Prods>();  
        
        productsList.add(new Prods(1,"HP Laptop",25000f));  
        productsList.add(new Prods(2,"Dell Laptop",30000f));  
        productsList.add(new Prods(3,"Lenevo Laptop",28000f));  
        productsList.add(new Prods(4,"Sony Laptop",28000f));  
        productsList.add(new Prods(5,"Apple Laptop",90000f)); 
        
        double productPriceSum=productsList.stream()
        		.collect(Collectors.summingDouble(Prods->Prods.price));
        
        
        System.out.println(productPriceSum);
    }  

}  