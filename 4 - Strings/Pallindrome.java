// Pallindrome Checker

public class Pallindrome {
    public static void checkPallindrome(String arg) {
        boolean isPallindrome = false;
        int avg = arg.length() / 2;
        for (int i = 0; i < avg; i++) {
            if (arg.charAt(i) == arg.charAt(arg.length() - 1 - i)) {
                isPallindrome = true;
                // System.out.print(arg.charAt(i) + " " + arg.charAt(arg.length() - 1 - i));
            } else {
                isPallindrome = false;
            }
            System.err.println(" ");
        }
        System.out.print(isPallindrome);
    }

    public static void main(String args[]) {
        checkPallindrome("Moom");
    }
}