public class StringComparison {
    public static void main(String args[]) {
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");

        if (S1 == S2) {
            System.out.println("Same Same");
        } else if (S1 == S3) {
            System.err.println("Same Same but Different");
        } else {
            System.err.println("No One is Same");
        }

        System.out.println(S1.equals(S3));
    }
}