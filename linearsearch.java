import java.io.*;
import java.util.*;

class Linearsearch{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();	
	int[] ar = new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i] = sc.nextInt();
	}
	int a = sc.nextInt();
	int b=0;
	for(int i=0;i<n;i++)
	{
		if(ar[i]==a)
		{
			b = i;
		}
	}
	if(b==0)
	{
		System.out.println("Element is not present in the array.");
	}
	else
	{
		System.out.println("Elemenet is present at the index: "+b);
	}
}

}