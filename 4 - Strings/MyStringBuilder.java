public class MyStringBuilder {
    public static void main(String args[]) {

        /*
         ----------------------------------------------------------------------
         WHY WE USE STRINGBUILDER INSTEAD OF STRING
         ----------------------------------------------------------------------

         1. String in Java is **immutable**:
            - You cannot change an existing String once created.
            - Every time you do:   str = str + ch;
              A **new String object** is created in the heap.
              The old one becomes unused and waits for garbage collection.

            Example:
                str = "a";      // creates "a"
                str = str + "b"; // creates new object "ab"
                str = str + "c"; // creates new object "abc"
            => Many temporary objects → SLOW (O(n^2))


         2. StringBuilder is **mutable**:
            - It does NOT create new objects on every append.
            - It modifies the internal character array.
            - append() is very fast → O(1) amortized.

            So:
                sb.append('a');
                sb.append('b');
                sb.append('c');

            Stores characters in the same internal buffer.


         ----------------------------------------------------------------------
         TIME COMPLEXITY DIFFERENCE
         ----------------------------------------------------------------------

         Using String:
             str = str + ch;
         Time Complexity = O(n^2)
         Reason:
             Each new string copy takes O(n) time,
             repeated for n iterations → n * n = O(n^2)

         Using StringBuilder:
             sb.append(ch);
         Time Complexity = O(n)
         Reason:
             append() is O(1) amortized,
             repeated n times → n * O(1) = O(n)


         ----------------------------------------------------------------------
         MEMORY STORAGE: STACK vs HEAP
         ----------------------------------------------------------------------

         STACK:
            - Stores references (variable names)
            - Example:
                  sb  --> (reference to StringBuilder object)

         HEAP:
            - Stores actual objects (String, StringBuilder, arrays)

         ----------------------------------------------------------------------
         DIAGRAM (ASCII REPRESENTATION)
         ----------------------------------------------------------------------

         Case 1: Using String (immutable)

                 STACK                        HEAP
              +-----------+            +------------------+
              |  str      |--->        | "a"              |
              +-----------+            +------------------+
                     |
                     | reassign str = str + "b"
                     v
              +-----------+            +------------------+
              |  str      |--->        | "ab"             |
              +-----------+            +------------------+
                     |
                     | reassign again str = str + "c"
                     v
              +-----------+            +------------------+
              |  str      |--->        | "abc"            |
              +-----------+            +------------------+
             
              (Old strings "a" and "ab" stay in heap until GC cleans them)


         Case 2: Using StringBuilder (mutable)

                 STACK                        HEAP
              +-----------+            +---------------------------+
              |   sb      |--->        | StringBuilder object      |
              +-----------+            |   buffer: ['a','b','c']   |
                                       +---------------------------+

              Only **ONE** object in heap — fast & memory-efficient.


         ----------------------------------------------------------------------
        */

        // Efficient way using StringBuilder
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // O(1) append (amortized)
        }

        System.out.print(sb.toString()); // Output: abcdefghijklmnopqrstuvwxyz
    }
}
