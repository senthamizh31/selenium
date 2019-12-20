package sample;

class poly{	
	void meth1() {	
		System.out.println("inside poly");
	}	
}

class poly2 extends poly{
	void meth1() {
		System.out.println("inside poly2");
	}
	
}

public class polymorphism {
	public static void main(String[] args) {		
		poly2 obj = new poly2();
		obj.meth1();
	}
}
