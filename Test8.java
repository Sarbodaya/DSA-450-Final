// Kadane's Algorithm
import java.util.*;
public class Test8
{


	// Naive Approach
	static int maximumSubArraySum(int[] arr,int n)
	{
		int res = arr[0];
		for(int i=0;i<n;i++)
		{
			int currSum = 0;
			for(int j=i;j<n;j++)
			{
				currSum += arr[j];
				res = Math.max(currSum,res);
			}
		}
		return res;
	}

	// Efficient Algo
	static int maxSum(int[] arr,int n)
	{
		int res = arr[0];
		int maximumEnd = arr[0];
		for(int i=1;i<n;i++)
		{
			maximumEnd = Math.max(maximumEnd+arr[i],arr[i]);
			res = Math.max(maximumEnd,res);
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,-2,5};
		int[] arr1 = {-10,-1,-2,-3};

		// System.out.print(maxSum(arr,arr.length));
		System.out.print(maxSum(arr1,arr1.length));
	}
}