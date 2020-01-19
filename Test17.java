package com.Ekhareedo;

//% Opertors(add program)

public class Test17 {

		   public static void main(String[] args) {
		    int num=7589;
		    int a, b, c, d;
		    
		    d = num % 10;
		    num = num /10;
		    c = num % 10;
		    num = num / 10;
		    b = num % 10;
		    a = num / 10;
		    int f=(a+b+c+d);

		    
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);

		    System.out.println(f);
		    
		    
		    
		   }
}



