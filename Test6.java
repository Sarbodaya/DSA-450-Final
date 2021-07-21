// Union of two arrays 
import java.util.*;
public class Test6
{


	static int doUnion(int a[], int n, int b[], int m)
	{
		int[] arr = new int[m+n];
		int k = arr.length;
		int i = 0;
		for(i=0;i<n;i++)
		{
		    arr[i] = a[i];
		}
		
		for(int j=0;j<m;j++)
		{
		    arr[j+i] = b[j];
		}
		
		int count = 0;
		Arrays.sort(arr);
		for(int p=0;p<k-1;p++)
		{
		    if(arr[p] != arr[p+1])
		    {
		        count++;
		    }
		}
		return count+1;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3};

		int n1 = a.length;
		int n2 = b.length;

		System.out.print(doUnion(a,n1,b,n2));

		

	}
}