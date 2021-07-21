// Cyclically rotate an array by one 

public class Test7
{

	static void reverse(int low,int high,int[] arr)
	{
		while(low <= high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	static void rotate(int[] arr,int k,int n)
	{
		reverse(0,k-1,arr);
		reverse(k,n-1,arr);
		reverse(0,n-1,arr);
	}

	public static void main(String[] args) {
		
		int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
		int n = arr.length;
		rotate(arr,1,n);

		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
}