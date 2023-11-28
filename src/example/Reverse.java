package example;

public class Reverse {

	public static void main(String[] args)
	{
		int num=123456;
		int rev=0;
		int rem;
		for(;num!=0;num=num/10)
		{
			rem=num%10;
			rev=rev*10+rem;
		
		}
		System.out.println("reverse of the number=" +rev);	

	}

}


