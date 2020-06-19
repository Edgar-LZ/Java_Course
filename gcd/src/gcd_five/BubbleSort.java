package gcd_five;

public class BubbleSort {
	public int[] sort(int[] array) {
		int arr[] = new int[array.length];
		
		for(int i=0;i<array.length;i++)
			arr[i] = array[i];
			
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		return arr;
	}
}
