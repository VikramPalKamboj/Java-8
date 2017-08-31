package stramApi;

import java.util.*;  
class Produc{  
    int id;  
    String name;  
    float price;  
    public Produc(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamApiMaxMin {  
    public static void main(String[] args) { 
    	
        List<Produc> productsList = new ArrayList<Produc>();  
        
        productsList.add(new Produc(1,"HP Laptop",25000f));  
        productsList.add(new Produc(2,"Dell Laptop",30000f));  
        productsList.add(new Produc(3,"Lenevo Laptop",28000f));  
        productsList.add(new Produc(4,"Sony Laptop",28000f));  
        productsList.add(new Produc(5,"Apple Laptop",90000f)); 
       
        //finding max price from list 
        Produc pPrice=productsList.stream()
        .max((p1,p2)->p1.price>p2.price?1:-1).get();
        
        System.out.println(pPrice.price);
        
        
        //finding min price from list 
        Produc pPrice2=productsList.stream()
        .max((p1,p2)->p1.price<p2.price?1:-1).get();
        
        System.out.println(pPrice2.price);
    }  

}  