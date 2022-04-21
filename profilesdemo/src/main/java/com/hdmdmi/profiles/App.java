package com.hdmdmi.profiles;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String s=(String) PropertiesLoader.loadProperties("application.properties").get("db.url");
        System.out.println(s);
    }
}
