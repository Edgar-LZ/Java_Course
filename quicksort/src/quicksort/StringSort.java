package quicksort;

public class StringSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		String tosort = "cb1ARzFqdVe,  gjnsvG5rgH#$%.";
		String sorted = qs.sort(tosort);
		System.out.println(tosort+" --> "+ sorted);

	}

}
