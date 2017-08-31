package Java8Nashorn;

import javax.script.*;  
import java.io.*;  
public class JavaNashorn {  
    public static void main(String[] args) throws Exception{  

    	
    	ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");  
         
        se.eval(new FileReader("js/hello.js"));  
    }  
}  