public class AccessModifier {
    public static void main(String[] args) {

        /*
         * ================================
         *     ACCESS MODIFIERS IN JAVA
         * ================================
         *
         *  Four Types:
         *  -----------------------------------------
         *  1) private
         *  2) default  (also called "package-private")
         *  3) protected
         *  4) public
         *  -----------------------------------------
         *
         *  Accessibility Table:
         *
         *                       Within     Within      Outside     Outside
         *                       Class      Package     Package     Package (Subclass)
         * ---------------------------------------------------------------------------
         *  private                YES         NO          NO              NO
         *  default                YES        YES          NO              NO
         *  protected              YES        YES          NO             YES
         *  public                 YES        YES         YES             YES
         * ---------------------------------------------------------------------------
         *
         *  Notes:
         *  - private → only inside the same class.
         *  - default → inside same package only.
         *  - protected → same package + outside package ONLY in subclass.
         *  - public → everywhere.
         */


        AccessBasedUser ac1 = new AccessBasedUser();

        // Public variable → we can access directly
        ac1.userName = "chandan";

        // Private variable → CANNOT access directly
        // ac1.Password;  // ❌ ERROR → Password has private access

        // But we CAN access it via public/default/protected method
        ac1.setPass("chandan");

        System.out.println(ac1.userName);
        // System.out.println(ac1.Password); // ❌ ERROR: Password is private
    }
}


class AccessBasedUser {

    // PUBLIC → accessible anywhere
    public String userName;

    // PRIVATE → only this class can access
    private String Password;

    // DEFAULT method (no modifier) → accessible only within same package
    void setPass(String ps) {
        Password = ps;
    }

    // Optionally, add a public getter to read the password (if needed)
    // public String getPass() {
    //     return Password;
    // }
}
