package sampleJavaApplication;


public class Animal {
	public static void main(String[]args)
	{
		 class animal1
		{
			 void Shout()
			{
				System.out.println("Roaring");
			}
			
		}
		
		class Dog extends animal1
		{
			void Shout1()
			{
			System.out.println("Barking");	
			}
		}
		animal1 d= new Dog();
		d.Shout();
		
	}

}
