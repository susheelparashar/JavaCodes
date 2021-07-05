import java.util.Scanner;
public class ArmStrongNumberWantContinue {

	public static void main(String[] args) {
	String yn;
	do
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=s.nextInt();
		int t1=no, rem, arm=0;
		int numDigits = String.valueOf(no).length();
			   	while(t1!=0)
		    	{
		    	int mul=1;
		    	rem=t1%10;
		    			for (int i=1; i<=numDigits; i++)
		    			{
		    				mul=mul*rem;	
		    			}
		    	arm=arm+mul;
		    	t1=t1/10;
		    	}
	   	if (no==arm)
	   	
	   	{
	   		System.out.println("its is armstrong number");
	   		System.out.println(".................................................");
	   		System.out.println("Want to continue.....(Y/N)");
	   		yn=s.next();
	   	}
	   	else
	   	{
	   		System.out.println("not armstrong number");
	   		System.out.println(".................................................");
	   		System.out.println("Want to continue.....(Y/N)");
	   		yn=s.next();
	  	}
		}
   	while((yn.equals("y"))||(yn.equals("Y")));
	}
	
}
