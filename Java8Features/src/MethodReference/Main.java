package MethodReference;

interface Calculator{
	void add(int a,int b);
}

class Calc{
	public static void addSomething(int a ,int b) {
		System.out.println(a+" and "+b+" addition is: "+(a+b));
	}
	
	public void letsAdd(int a ,int b) {
		System.out.println(a+" and "+b+" adds to: "+(a+b));
	}
}

interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String str){
		System.out.println(">> Message is: "+str);
	}
}

public class Main {
	public static void main(String[] args) {
		
		//Calc.addSomething(10, 20);
		
		//1.Reference to a static method
//		Calculator cRef=Calc::addSomething;  //method reference
//		cRef.add(10, 20);
		
		//2.Reference to a non static method or Instance method
//		Calc calc=new Calc();
//		Calculator cRef=calc::letsAdd;
//		cRef.add(10,20);
		
		//3.Reference to a constructor
		Messenger mRef=Message::new;
		mRef.getMessage("Welcome");
		
	}

}
