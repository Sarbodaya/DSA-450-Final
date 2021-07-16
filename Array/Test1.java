// Move all negative numbers to beginning and positive to end with constant extra space
public class Test1
{
	static void rearrange(int[] arr,int n)
	{
		int j = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] < 0)
			{
				if(i != j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	static void printList(int[] arr)
	{
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n = arr.length;
		rearrange(arr,n);
		printList(arr);
	}


}