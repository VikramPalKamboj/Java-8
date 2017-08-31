package stramApi;

import java.util.*;  
class Products{  
    int id;  
    String name;  
    float price;  
    public Products(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamFilteringAndIterating {  
    public static void main(String[] args) { 
    	
        List<Products> productsList = new ArrayList<Products>();  
        
        productsList.add(new Products(1,"HP Laptop",25000f));  
        productsList.add(new Products(2,"Dell Laptop",30000f));  
        productsList.add(new Products(3,"Lenevo Laptop",28000f));  
        productsList.add(new Products(4,"Sony Laptop",28000f));  
        productsList.add(new Products(5,"Apple Laptop",90000f)); 
        
        productsList.stream()
        .filter(p->p.price==30000)
        .forEach(p->System.out.println(p.price));
    }  

}  