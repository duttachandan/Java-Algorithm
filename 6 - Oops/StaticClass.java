public class StaticClass {

    /*
     * Correct Explanation:
     * --------------------
     * main() is static because JVM calls it WITHOUT creating an object.
     * static DOES NOT mean "uneditable".
     * static only means "belongs to class, not instance".
     */
    public static void main(String args[]) {
        SumCalculator.sumCal(5, 10); 
        // calling static method of interface
    }
}

/*
 * INTERFACE RULES:
 * ----------------
 * - Variables must be public static final (constants)
 * - Methods cannot have a body (unless default or static)
 * - Static methods CANNOT use 'this'
 */

interface SumCalculator {

    // Must initialize because they are FINAL (constants)
    int A = 0;
    int B = 0;

    void dummyFunc();
    // Correct static method
    static void sumCal(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }
}

class Sum2Cal implements SumCalculator {
    public void dummyFunc() {
        System.out.println("Dummy function implemented");
    }
}
