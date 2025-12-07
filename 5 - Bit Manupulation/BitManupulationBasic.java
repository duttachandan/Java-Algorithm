public class BitManupulationBasic {
    public static void main(String[] args) {

        // Decimal to binary
        // let's say I have 4 in Decimal → in binary it is 100
        // (100)2 = (4)10

        // Binary to Decimal
        // let's say the Binary number is 1001
        // 1 * 2^3 + 0 * 2^2 + 0 * 2^1 + 1 * 2^0 = 9
        // (1001)2 = (9)10

        /*
         * ----------------------------------------
         * Decimal → 4-bit Binary (for understanding)
         * 0   -> 0000
         * 1   -> 0001
         * 2   -> 0010
         * 3   -> 0011
         * 4   -> 0100
         * 5   -> 0101
         * 6   -> 0110
         * 7   -> 0111
         * 8   -> 1000
         *
         * Java actually uses 32-bit binary internally.
         */

        /*
         * ==============================
         *  BITWISE OPERATORS IN JAVA
         * ==============================
         * 1)  AND  (&)
         * 2)  OR   (|)
         * 3)  XOR  (^)
         * 4)  NOT  (~)  → one’s complement
         * 5)  LEFT SHIFT (<<)
         * 6)  RIGHT SHIFT (>>) — arithmetic (sign-preserving)
         * 7)  UNSIGNED RIGHT SHIFT (>>>) — logical (fills with 0)
         */

        /*
         * ----------------------------
         * 1) BITWISE AND (&)
         * ----------------------------
         * Truth table:
         * a b | a & b
         * 0 0 | 0
         * 0 1 | 0
         * 1 0 | 0
         * 1 1 | 1
         *
         * Example:
         * a = 5 = 0101
         * b = 3 = 0011
         * 0101
         * 0011
         * ---- AND
         * 0001 → 1
         */

        /*
         * ----------------------------
         * 2) BITWISE OR (|)
         * ----------------------------
         * Truth table:
         * a b | a | b
         * 0 0 | 0
         * 0 1 | 1
         * 1 0 | 1
         * 1 1 | 1
         *
         * Example:
         * 0101
         * 0011
         * ---- OR
         * 0111 → 7
         */

        /*
         * ----------------------------
         * 3) BITWISE XOR (^)
         * ----------------------------
         * Truth table:
         * a b | a ^ b
         * 0 0 | 0
         * 0 1 | 1
         * 1 0 | 1
         * 1 1 | 0
         *
         * Example:
         * 0101
         * 0011
         * ---- XOR
         * 0110 → 6
         */

        /*
         * ----------------------------
         * 4) ONE'S COMPLEMENT (~)
         * ----------------------------
         * Flips every bit (0→1, 1→0)
         *
         * Example (showing 8 bits only):
         * a = 5 → 0000 0101
         * ~a    → 1111 1010 (which is -6 in decimal, 2's complement)
         */

        /*
         * ------------------------------------
         * 5) LEFT SHIFT (<<)
         * ------------------------------------
         * Moves all bits to the LEFT.
         * Each shift left (x << 1) = multiply by 2.
         *
         * Example:
         * a = 5 → 0101
         *
         * a << 1:
         * 0101 << 1 → 1010 (binary) = 10 decimal
         *
         * a << 2:
         * 0101 << 2 → 10100 (binary) = 20 decimal
         *
         * General rule:
         *      a << n  =  a * (2^n)
         */

        /*
         * ------------------------------------
         * 6) RIGHT SHIFT (>>)  *Arithmetic*
         * ------------------------------------
         * Moves bits to the RIGHT.
         * Fills left side with the SIGN bit (0 for positive, 1 for negative).
         *
         * For positive numbers, right shift = divide by 2.
         *
         * Example:
         * a = 10 → 1010
         *
         * a >> 1:
         * 1010 >> 1 → 0101 = 5
         *
         * a >> 2:
         * 1010 >> 2 → 0010 = 2
         *
         * General rule:
         *      a >> n = a / (2^n) (floor division)
         */

        /*
         * ------------------------------------
         * 7) UNSIGNED RIGHT SHIFT (>>>)
         * ------------------------------------
         * Always fills with 0 (even for negative numbers!)
         *
         * Example:
         * If x = -1 (binary = all 1s)
         *
         * x >>> 1  gives:
         * 0111 1111 1111 ... (31 ones after shift)
         * Result = large positive number
         *
         * This is why >>> is called "logical shift right".
         */

        /*
         * ----------------------------
         * SUMMARY TABLE
         * ----------------------------
         * Let a = 5 (0101), b = 3 (0011)
         *
         * a & b   → 1
         * a | b   → 7
         * a ^ b   → 6
         * ~a      → -6
         * a << 1  → 10
         * a << 2  → 20
         * 10 >> 1 → 5
         * 10 >> 2 → 2
         * -1 >>> 1 → large positive number
         */

        // Actual Java demo:
        int a = 5, b = 3;

        System.out.println("a      = " + a);
        System.out.println("b      = " + b);
        System.out.println("a & b  = " + (a & b));
        System.out.println("a | b  = " + (a | b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("~a     = " + (~a));

        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));

        System.out.println("10 >> 1 = " + (10 >> 1));
        System.out.println("10 >> 2 = " + (10 >> 2));

        System.out.println("-1 >>> 1 = " + (-1 >>> 1));
    }
}
