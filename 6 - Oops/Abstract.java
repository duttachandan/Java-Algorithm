/*
 *  TOPIC: ABSTRACT CLASS & ABSTRACT METHOD
 *  ---------------------------------------
 * 
 * 

 *
 *  ABSTRACT CLASS:
 *  ---------------
 *  - A class declared using `abstract` keyword.
 *  - Cannot be instantiated directly.
 *  - Can contain both:
 *      ✓ abstract methods (no body)
 *      ✓ non-abstract methods (with body)
 *  - Can have constructors (YES! constructors of abstract classes run
 *    when their child class object is created).
 * 
 *  WHY TO USE ABSTRACT CLASS?
 * -----------------------------
 *  To create a template or blueprint:
 * 
 *          1. You want some behavior to be common
 *          2. You want every subclass to complete specific methods
 * 
 *  Example:
 *          All animals eat → common method
 *          But all animals walk differently → abstract method
 *
 *  ABSTRACT METHOD:
 *  ----------------
 *  - Declared without a body.
 *        abstract void walk();
 *  - Must be overridden in the first non-abstract child class.
 *
 *  CONSTRUCTOR CALL ORDER:
 *  ------------------------
 *  - In inheritance:
 *        Parent → Child → Grandchild
 *    constructor order ALWAYS goes from TOP TO BOTTOM.
 *
 *  In this file:
 *
 *        Animal (abstract)
 *           ↑
 *         Dog
 *           ↑
 *        Human
 *
 *  Creating a Human object will call constructors in this order:
 *        Animal → Dog → Human
 *
 */

public class Abstract {
    public static void main(String[] args) {

        /*
         * Creating Human object
         * ---------------------
         * Even though Animal is abstract,
         * its constructor executes FIRST.
         */
        Human h1 = new Human();
        h1.walk(); // calls Human's overridden walk()

        System.out.println("\n---------------------------------\n");

        /*
         * Creating Dog object
         * -------------------
         * Calls:
         * Animal() → Dog()
         */
        Dog dg = new Dog();
        dg.walk(); // calls Dog's overridden walk()
    }
}

/*
 * =========================================================
 * ABSTRACT BASE CLASS
 * =========================================================
 */
abstract class Animal {

    // Constructor of abstract class (YES, allowed)
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Abstract method → MUST be overridden
    abstract void walk();
}

/*
 * =========================================================
 * CHILD CLASS: Dog
 * (FIRST NON-ABSTRACT CHILD → must implement walk())
 * =========================================================
 */
class Dog extends Animal {

    Dog() {
        System.err.println("Dog constructor called");
    }

    // @Override
    void walk() {
        System.out.println("I walk on 4 legs");
    }
}

/*
 * =========================================================
 * GRANDCHILD CLASS: Human
 * (Overrides walk() again)
 * =========================================================
 */
class Human extends Dog {

    Human() {
        System.err.println("Human constructor called");
    }

    // @Override
    void walk() {
        System.err.println("Human walks on 2 legs");
    }
}
