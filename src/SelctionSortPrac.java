
public class SelctionSortPrac {

	public static void selectSort(int[] array) {
		int indexMin;
		for (int i = 0; i < array.length-1; i++) {
			indexMin = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[indexMin]) {
					indexMin = j;
				}
			}
			swap(array, indexMin, i);
		}
	}

	private static void swap(int[] array, int indexMin, int i) {
		// TODO Auto-generated method stub
		
	}	
	
}
