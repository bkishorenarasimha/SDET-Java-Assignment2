public class NumRev
	{  
		public static void main(String[] args)   
		{  int a=123;
			System.out.print("reverse of 123 is ");
			while(a>=1)
			{
				System.out.print(a%10);
				a=a/10;
			}
		}
	}	