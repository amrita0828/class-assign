import java.util.Scanner;

public class subsum {
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter value of k: ");
		k=sc.nextInt();
		int var;
		var=((n-k+1)*(n-k+2))/2;
		System.out.println("var= "+ var);
	}

}