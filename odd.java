import java.util.*;
public class odd {
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		if(n>0)
		{
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		}
		else {
			System.out.println("Invalid");
		}
	}
}
