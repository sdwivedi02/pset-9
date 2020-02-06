import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
            return true;
        }
        return false;
	}

		// write your code here

		return false;	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here

		if (values == null || values.size() < n || n < 0) {
				 ArrayList<String> empty = new ArrayList<String>();
				 return empty;
			 }
		 ArrayList<String> newArray = new ArrayList<String>();
		 for (int i = 0; i < n; i++) {
				 newArray.add(values.get(i));
		 }
			 for (int i = (values.size() - n); i < values.size(); i++) {
					 newArray.add(values.get(i));
			 }
	 return newArray;
 		}	// default return value to ensure compilation

	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		return Collections.max(numbers) - Collections.min(numbers);		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		if (numbers == null || numbers.size() % 2 == 0 || numbers.size() < 3) {
			return -1;
		}
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				return -1;
			}
		}

		ArrayList<Double> result = new ArrayList<Double>();
		result.add(numbers.get(0));
		result.add(numbers.get((numbers.size() - 1) / 2));
		result.add(numbers.get(numbers.size() - 1));

		return Collections.max(result);		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
	        ArrayList<String> empty = new ArrayList<String>();
            return empty;
        }
        String first = values.get(((values.size() - 1) / 2) - 1);
        String middle = values.get(((values.size() - 1) / 2));
        String last = values.get(((values.size() - 1) / 2) + 1);
        ArrayList<String> result = new ArrayList<String>();
        result.add(first);
        result.add(middle);
        result.add(last);
        return result; 	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		if (numbers == null || numbers.size() < 3) {
					 return false;
			 }
			 for (int i = 1; i < numbers.size() - 1; i++) {
					 if ((numbers.get(i - 1) == (numbers.get(i) - 1)) && (numbers.get(i) == (numbers.get(i + 1) - 1))) {
							 return true;
					 }
			 }
			 return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		if (numbers == null || numbers.size() < 1) {
            return false;
        }
				int counter = 0;
        for (int value : numbers) {
            if (value == x) {
                counter++;
            }
        }
			
		}	// default return value to ensure compilation

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
