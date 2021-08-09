public class Sumdigits
	{  
		public static void main(String[] args)   
		{  int a=1234,Sum=0;
			
			while(a>=1)
			{
				Sum=Sum+(a%10);
				a=a/10;
			}
			System.out.print("Sum of 1234 is "+Sum);
		}
	}	