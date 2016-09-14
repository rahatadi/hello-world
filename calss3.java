package project1;

public class calss1 {

	public static void main(String[] args) {
		
		
		System.out.println("hello_to_all_i_am_here!");
		public int indexOfFirstOccurrence(String[] stringArray, String target)
		{
			for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(target)) {
			return i;
			}
			}
			return -1;
			}

	}
	
}


