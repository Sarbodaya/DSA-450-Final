// Sort an array of 0s, 1s and 2s 
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
public class Test4
{

	static void swap(int low,int high,int[] arr)
	{
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {0,2,1,2,0,1};
		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = n-1;
		while(mid<=high)
		{
			switch (arr[mid]) 
			{
				case 0:
					swap(low,mid,arr);	
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(mid,high,arr);
					high--;
					break;
			}
		}

		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
}