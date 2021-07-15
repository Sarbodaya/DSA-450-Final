import java.util.*;
import java.io.*;
class reverseTheArray{

	static void reverse(int[] arr)
	{
		int low = 0;
		int high = arr.length - 1;
		while(low <= high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		reverse(arr);
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
	}
}