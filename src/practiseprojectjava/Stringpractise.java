package practiseprojectjava;

public class Stringpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("hi"+args[0]+args[1]);
		String s="Hello";
		String s3="Hello";
		System.out.println("memory locaton before "+s.hashCode());
StringBuffer s1= new StringBuffer("Hello");

s1.append("fdsf");
System.out.println("memory locaton before "+s3.hashCode());
System.out.println("memory locaton before "+s1.hashCode());
	
	 }

}
