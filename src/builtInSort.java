import java.util.*;

public class builtInSort {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> numsToSort = new ArrayList<Integer>();
		
		for (int i =0; i < 5; i++) {
			numsToSort.add(random.nextInt(100));
		}
		
		Collections.sort(numsToSort);
		System.out.println("New array after built in sort: " + numsToSort.toString());
	}
}
