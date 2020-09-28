package com.unittest.testing;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input Celcius : ");
        double celcius = sc.nextDouble();
        
        Fahrenheit f = new Fahrenheit();
        
        while (!f.isBound(celcius)) {
        	System.out.println("input again");
        	System.out.print("input Celcius : ");
        	celcius = sc.nextDouble();
		}
        
        f.input(celcius);
        f.tranfromFahrenheit();
        System.out.println(f.toString());
    }
}
