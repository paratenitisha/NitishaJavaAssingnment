package practiseprojectjava;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class AssingnException {
	
	///int [] arr={89,90,65,43,87};
	//public void sum()

	//{

	
	
			

	public static void main(String[] args) {
		try
		
			
		    {
			 AssingnException objA =new AssingnException();
			 //Object obj = null;
			 
		        //System.out.println("The pointer is "+obj.hashCode());
		
					
	    	}
		catch(Exception e)
		   {
			

			System.out.println("in try catch");
			System.out.println(e.getMessage());
			
		   }
		finally
		  {
			
			System.out.println("in try finally");
		   }
		// TODO Auto-generated method stub
		
		ArrayList <String> a1=new ArrayList<> ();
		a1.add("djkdj");
		a1.add("sdjfkdsj");
		a1.add("SFF0");
		
		

for(String s:a1)
{
 System.out.println(s);
}


	}

}
