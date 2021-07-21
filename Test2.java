// Maximum and minimum of an array using minimum number of comparisons
public class Test2
{
	static int max(int[] arr)
	{
		int n = arr.length;
		int max = arr[0];
		for(int i=1;i<n;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}


	static int min(int[] arr)
	{
		int n = arr.length;
		int min = arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int[] arr = {1000, 11, 445, 1,330,3000};
		System.out.println(min(arr));
		System.out.println(max(arr));
	}
}