package Java;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,i,key,flag;
		System.out.println("enter the no.of elements in an array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the  array elements ");
		for(i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the  key elements ");
		key=sc.nextInt();
		for(i=0;i<=n-1;i++)
		if (a[i]==key)
		{
			System.out.println("enter the index "+i);
			flag=1;
			break;
		}
		if(a[i]!=key) {
			System.out.println("enter the  key elements is not found ");
		}
		
	}

}
