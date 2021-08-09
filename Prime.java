public class Prime
{  
	public static void main(String[] args)   
	{  int a,b=0;
		
		for (a=1;a<=13;a++)
		{
		if(13%a==0)
			{
				b++;
			}  
		}
		if (b==2)
		{
			System.out.print("13 is prime number");
		}
		else 
			System.out.print("13 is non prime number");
	}
}	