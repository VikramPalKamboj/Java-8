package stramApi;

import java.util.*;  
class Prod{  
    int id;  
    String name;  
    float price;  
    public Prod(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamApiReduceMethod {  
    public static void main(String[] args) { 
    	
        List<Prod> productsList = new ArrayList<Prod>();  
        
        productsList.add(new Prod(1,"HP Laptop",25000f));  
        productsList.add(new Prod(2,"Dell Laptop",30000f));  
        productsList.add(new Prod(3,"Lenevo Laptop",28000f));  
        productsList.add(new Prod(4,"Sony Laptop",28000f));  
        productsList.add(new Prod(5,"Apple Laptop",90000f)); 
        
        Float productPriceSum=productsList.stream()
        .map(p->p.price)
        .reduce(0.0f,(sum,price)->sum+price);
        
        System.out.println(productPriceSum);
    }  

}  