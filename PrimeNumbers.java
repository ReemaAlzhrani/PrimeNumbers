package primeNumbers;
import java.util.Scanner; 
public class namesprocessor {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
// names
	        System.out.println("Enter the name: ");
	        String name = scanner.nextLine();
//size of the array
	        
	        System.out.println("Enter the number of names in the array: ");
	        int size = scanner.nextInt();
// declaring the array 
	        
	        String[] namesArray = new String[size];
	        System.out.println("Enter the names in the array:");

	        for (int i = 0; i < size; i++) {
	            namesArray[i] = scanner.next();
	        }
// using findNameIndex method 
	        int index = findNameIndex(name, namesArray);

	        if (index != -1) {
	            System.out.println("Output = " + index);
	        } else {
	            System.out.println("Name not found in the array.");
	        }
	    }
	
	//////// method 
	
	public static int findNameIndex(String name, String[] namesArray) {
        for (int i = 0; i < namesArray.length; i++) {
            for (int j = 0; j < name.length(); j++) {
   // if characters at index j are equal  * ignoring case*
                if (Character.toLowerCase(namesArray[i].charAt(j)) != Character.toLowerCase(name.charAt(j))) {
                    break;
    // Break out of the inner loop if characters don't match
                } else if (j == name.length() - 1) {
                    return i;
    // Return the index if the name matches
                }
            }
        }
        return -1;
        // Return -1 if name is not found
    }
}

