public class Fibonacci
{
	public static int of(int num) 
	{
		if(num==1||num==2)
		{
		return 1;
		}
		else
		{
		return of(num-2)+of(num-1);
		}
	}
	public static void main(String[] args)
	{
		int i=1;
		do
		{
		System.out.println(of(i));
		i++;
		}while(of(i)<=200);
	}
	
}
