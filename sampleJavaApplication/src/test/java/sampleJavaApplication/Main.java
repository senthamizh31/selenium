package sampleJavaApplication;

public class Main {
	public static void main(String[]args)
	{
		Namitha n = new Wipro();
		n.Campus1();
		n.Campus2();
		n.Campus3();
	}

}
interface Saveetha
{
	void Campus1();
	
}
interface Kavitha extends Saveetha
{
      void Campus2();	
}

interface Namitha extends Kavitha
{
      void Campus3();		
}
class Wipro implements Namitha
{
	public void Campus1()
	{
		System.out.println("Interview1");
	}
	public void Campus2()
	{
		System.out.println("Interview2");
	}
	
	public void Campus3()
	{
		System.out.println("Interview3");
	}	
	
}