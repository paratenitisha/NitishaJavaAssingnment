
package practiseprojectjava;


 
public class StringPro {


	public static void main(String[] args) {
	
		
		int [] arr={55,44,22,77,11,22};
		
		
		//to find largest no in an array
		
		int maxnum=arr[0];
		
		for(int i=1;i<arr.length;i++)	
			
		{
		 if(arr[i]>maxnum)			  
			maxnum=arr[i];	
		 
	 
		}
			System.out.println("largest  no is "+maxnum);
		
	//to find smallest no in array	
		
			int minnum=arr[0];
			
			for(int i=1;i<arr.length;i++)	
				
			{
			 if(arr[i]<maxnum)			  
				minnum=arr[i];
			}
				System.out.println("smallest  no is "+minnum);
				System.out.println("=============================================");
				
				// to print the half array
				int halflen=(arr.length/2);
				
				for(int i=0;i<halflen;i++)	
				{
					
					System.out.println("Array elemnets are "+arr[i]);
						
					
					
				
					
					
				}
				System.out.println("_____________");
				//show array elements
			
				
				for(int i=0;i<arr.length;i++)	
				{
					
					System.out.println("Array elemnets are "+arr[i]);
				}
			System.out.println("------------------------------");
			//int [] arr={58,87,64,43,97};
	// to sort the array
				//int temp=arr[0];
				//int maxvalue;
				int len=arr.length-1;
				for(int i=0;i<len;i++)
					
				  {
					for(int j=i+1;j<len+1;j++)
						
					{
						System.out.println("Value of i is "+arr[i]);
						System.out.println("Value of j is "+arr[j]);
						if(arr[i]>arr[j])
						{
							
						
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
						System.out.println("after swapping Value of i is "+arr[i]);
						System.out.println("after swaping Value of j is "+arr[j]);
					}
				  }
				System.out.println("");
				System.out.println("");
				System.out.println("Array after sorting in Asending order ");
				
					for(int i=0;i<arr.length;i++)
					{
						
						System.out.println(arr[i]);
					}
					
					
					//to sort in desending order
					
					
					System.out.println("+++++++++++++++");
					System.out.println("Array after sorting in Desending order ");
					
						for(int i=len;i>=0;i--)
						{
							
							System.out.println(arr[i]);
						}
					
			/*	for(int i=0;i<len;i++)
				{
					for(int j=i+1;j<len;j++)
					{
						if(arr[i]<arr[j])
						{
							int temp=arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}
					}
							System.out.println("_________________________________________");
				}	
				System.out.println("Array after sorting in desending order ");
							
								for(int k=0;k<arr.length;k++)
								{
									
									System.out.println(arr[k]);
								}
							*/
						
}
	        			 
					 
				  }
					
					
				
					
					
				
				
				  
				


	

