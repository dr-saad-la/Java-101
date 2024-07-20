// =============================================================
// 		copyright: Dr. Saad Laouadi 2024
// =============================================================
// This is one line comment 


public class CommentDemo {
	// This is a simple method to create a banner

	/*
	This is multi-line comment 
	add here 
	add other thing here
	*/

	public static String repeatChar(char ch, int n){
		StringBuilder sb = new StringBuilder();      // Create a string builder

		for (int i =0; i < n; i++){
			sb.append(ch);
		}
		return sb.toString();        // return a string object from this method
	}

	// This is the main driver
	public static void main(String[] args) {

		String banner = repeatChar('=', 52);

		System.out.println(banner);
		System.out.println("      Comments in Java             ");
		System.out.println(banner);
		
		System.out.println("program run successfully and ended here!");
		// passAfterEnd(3);
		addEmptyLineAtEnd(3);
	}

	// Method to add empty lines
	public static void passAfterEnd(int nlines){

		for (int i=0; i < nlines; i++){
			System.out.println("\n");
		}
	}

	// Method to add empty lines
	public static void addEmptyLineAtEnd(int nlines) {
		if (nlines < 0) {
			throw new IllegalArgumentException("Number of lines must be non-negative.");
		}

		StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < nlines; i++) {
        	sb.append(System.lineSeparator());
    	}
    	System.out.print(sb.toString());
	}
}