/*
 *  TOPIC: METHOD OVERRIDING IN JAVA
 *  --------------------------------
 *
 *  What is Method Overriding?
 *  --------------------------
 *  - When a child class defines a method *with the same name, same parameters,
 *    and same return type* as its parent class.
 *  - The child class's method REPLACES (overrides) the parent's version.
 *
 *  Rules:
 *  ------
 *  1. Must be in parent-child (inheritance) relationship.
 *  2. Method signature (name + parameters) must match exactly.
 *  3. Access modifier cannot be more restrictive than parent.
 *  4. Runtime decides which method to run → Runtime Polymorphism / Dynamic Binding.
 *
 *  In this example:
 *  ----------------
 *  - Parent class: overideClass
 *  - Child class:  Fish
 *
 *  - Both classes have a method: whoRu()
 *    → Child class overrides the parent's version.
 *
 *  When you call:
 *        Salmon.whoRu();
 *    Java checks the OBJECT type (Fish), NOT the reference type,
 *    so the overridden version in Fish executes.
 */

public class Overriding {
    public static void main(String arg[]) {

        // Creating an object of Fish (child class)
        Fish Salmon = new Fish();

        // Setting value specific to Fish
        Salmon.fin(3);

        /*
         * whoRu() exists in BOTH:
         * - overideClass (parent)
         * - Fish (child)
         *
         * Because Fish overrides whoRu(),
         * → the child class method runs here.
         */
        Salmon.whoRu();
    }
}

/*
 * ============================
 * PARENT CLASS
 * ============================
 */
class overideClass {

    String Animal;

    // Setting the animal type
    void type(String Animal) {
        this.Animal = Animal;
    }

    // Parent class version of whoRu()
    void whoRu() {
        System.err.println("I am a " + this.Animal);
    }
}

/*
 * ============================
 * CHILD CLASS
 * ============================
 * - Extends overideClass
 * - Overrides the whoRu() method
 */
class Fish extends overideClass {

    int fin;

    void fin(int fin) {
        this.fin = fin;
    }

    /*
     * METHOD OVERRIDING:
     * -------------------
     * This method has:
     * - SAME NAME (whoRu)
     * - SAME PARAMETERS (none)
     * - SAME RETURN TYPE (void)
     *
     * Therefore, it overrides the parent's method.
     */
    void whoRu() {
        System.out.println("I have " + this.fin + " fins");
    }
}
