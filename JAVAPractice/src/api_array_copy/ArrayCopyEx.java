package api_array_copy;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		char[] arr1 = {'j','a','v','a'};
		
		//방법 1
		char[]arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr2));
		
		
		//방법2 : arr[1]~arr[2]를 arr2[0]~arr[1]로 복사
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		
		//arr1전체를 arr4로 복사
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		
		
		
	}
	
}
