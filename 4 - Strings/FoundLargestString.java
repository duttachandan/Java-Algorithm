public class FoundLargestString {
    public static void main(String args[]) {
        String arrOfString[] = { "Mango", "Fruit", "Bannana", "Nanno" };

        // Compare all the string in a lexographic order
        // compareTo = if it is 0 then both the string is equal
        // if < 0 then the largest < str2
        // if > 0 then the largest > str2
        
        String largest = arrOfString[0];
        for (int i = 0; i < arrOfString.length; i++) {
            if (largest.compareTo(arrOfString[i]) < 0) {
                largest = arrOfString[i];
            }
        }
        System.err.println(largest);
    }
}