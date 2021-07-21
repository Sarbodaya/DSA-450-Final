// Kth smallest element 

public class Test3
{
	public static void main(String[] args) {
		
		int[] arr = {7, 10, 4, 3, 20, 15};
		int n = arr.length;
		int k = 1;

		//Bubble Sort
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.print(arr[k-1]);
	}
}