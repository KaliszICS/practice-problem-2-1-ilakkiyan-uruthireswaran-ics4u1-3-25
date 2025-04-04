public class PracticeProblem {

	public static int find(int[] array, int number) {
		int count = 0;
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count++;
				index = i;
				i = array.length;
			}
		}
		return index;
	}

	public static int findLast(String[] array, String string) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals(string)) {
				return i;
			}
			}
			return -1;
		}
	
	public static int findSecond(char[] array, char character) {
		int count = 0;
		int Index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
				if (count == 1) {
					Index = i;
				} else if (count == 2) {
					return i;
				}
			}
		} 
		if (count == 1) {
			return Index;
		}
		return -1;
	}
	

	public static void main(String args[]) {
		int[] array = {1, 2, 4, 5, 3, 2, 4, 2};
		int result = find(array, 4);
		System.out.println(result);

		String[] array1 = {"Hello", "World", "Brother", "New", "Old"};
		int result1 = findLast(array1, "World");
		System.out.println(result1);

		char[] array2 = {'3', '3', '3', '3'};
		int result2 = findSecond(array2, '3');
		System.out.println(result2);

	}

	

}
