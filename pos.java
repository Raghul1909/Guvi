import java.util.*;
public class pos {
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
	}
}
