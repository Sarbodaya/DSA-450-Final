// Reverse the Array
class Test1
{
	public static void main(String[] args) {
		
		int[] arr = {4, 5, 1, 2};
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low <= high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
}