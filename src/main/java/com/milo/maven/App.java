package com.milo.maven;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final String HELLO = "Hello World!";
	
    public static void main( String[] args )
    {
        System.out.println( HELLO );
    }
    
    public boolean checkFive(Integer number) {
    	
    	Integer five = 5;
    	
    	return number != null ? number.equals(five) : false;      	    	    
    }
}
