package com.Ekhareedo;

public class Test12 {
		void M1 (byte a)
		{
			System.out.println(a);
		}
		void M2(int b)
		{
			System.out.println(b);
		}
		void M3(float c)
		{
			System.out.println(c);
		}
		void M4(char d)
		{
			System.out.println(d);
		}
		void M5(double e)
		{
			System.out.println(e);
		}
		
		public static void main(String[] args) {
			Test12 t1 = new Test12();
			t1.M1((byte)5);
			
			Test12 t2 = new Test12();
			t2.M2(10);
			
			Test12 t3 = new Test12();
			t3.M3(6);
			
			Test12 t4 = new Test12();
			t3.M4('g');
			
			Test12 t5 = new Test12();
			t3.M5(6);
		}
}
