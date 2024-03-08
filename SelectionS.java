import java.io.*;
import java.util.*;

public class SelectionS
{
	void sort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min])
				{
					min = j;
				}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	void print(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		SelectionS ss = new SelectionS();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		ss.sort(arr);
		System.out.println("Array after sorting:");
		ss.print(arr);
	}
}
		