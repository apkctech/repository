package main.java.home;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Enumeration;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("my first java class");

        Properties props = new Properties();
//        try {
        ResourceBundle rb = ResourceBundle.getBundle("properties", Locale.ENGLISH);
         Enumeration<String> keys = rb.getKeys();
          while(keys.hasMoreElements()){
              String key = keys.nextElement();
            System.out.println(key + " : " + rb.getString(key));
          }




//            props.loadFromXML(ClassLoader.getSystemResourceAsStream("properties.xml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
