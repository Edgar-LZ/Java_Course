package quicksort;

public class QuickSort {
	
	public String sort(String str) {
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++)
			arr[i] = str.charAt(i);
		
		quickSortChars(arr,0,arr.length-1);
		str = "";
		for(int i=0;i<arr.length;i++)
			str += arr[i];
		return str;
	}
	private void quickSortChars(char[] arr, int first, int last) {
		
		if(first >= last)
			return;
		
		int piv = last;
		int i=first;
		int pointer=first;
				
		for(i=first;i<piv;i++) {
			if(Character.toLowerCase(arr[i])<=Character.toLowerCase(arr[piv])) {
				char temp = arr[i];
				arr[i] = arr[pointer];
				arr[pointer] = temp;
				pointer++;
			}

		}
		char temp = arr[piv];
		arr[piv] = arr[pointer];
		arr[pointer] = temp;
		quickSortChars(arr, first, pointer-1);
		quickSortChars(arr, pointer+1,last);
		
	}
}
