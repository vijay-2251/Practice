import java.io.*;
import java.util.*;

class Bubblesort{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] ar = new int[n];
int temp =0;
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(ar[i]>ar[j])
{
temp = ar[i];
ar[i] = ar[j];
ar[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(ar[i]+" ");
}
}
}