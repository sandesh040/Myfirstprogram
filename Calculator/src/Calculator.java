

public class Calculator
{
	public static void main(String[] args) 
	{
   
	int n=10,t1=0,t2=1;
	System.out.print("First " + n + " terms: ");
	for(int i=1;i<=n;i++)                   //It will Check from 1 to 10 , loop will 
		                                    //work for ten times.
	{
		System.out.print(t1 + " + ");
        int sum=t1+t2;
		t1=t2;
		t2=sum;
	}
	System.out.println();
	}
	}
