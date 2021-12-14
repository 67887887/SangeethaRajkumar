package assignment.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CollectionArray {

	public static void main(String[] args) {
		// String Array
		String[] stringArray = new String[] { "CTS", "Wipro", "CApgemini", "TCS", "Dell" };

		List<String> input = new ArrayList<String>();

		for (int i = 0; i < stringArray.length; i++) {
			input.add(stringArray[i]);
		}
		Collections.sort(input);
		System.out.println(input);
	}
}