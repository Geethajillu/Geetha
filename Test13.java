package com.Ekhareedo;

// class and object

public class Test13 {
		int x;
		static int y;
		
		void dowork(int a, int b)
		{
			x=a;
			y=b;
		}
		
		public static void main(String[] args) {
			Test13 d1 = new Test13();
				   d1.dowork(5, 6);
				  
			Test13 d2 = new Test13();
			       d1.dowork(10, 20);

			d1.x = d2.y;
			d2.y = d1.x;
			
			System.out.println(d2.x);
			System.out.println(d2.y);
			
			System.out.println(d1.x);
			System.out.println(d1.y);
		}
}



