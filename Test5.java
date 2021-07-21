//Move all the negative elements to one side of the array 
public class Test5
{
	public static void main(String[] args) {
		
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;

		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] < 0)
			{
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}

		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
}