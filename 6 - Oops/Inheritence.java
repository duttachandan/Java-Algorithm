/*
 *  TOPIC: TYPES OF INHERITANCE (CONCEPTUAL) USING JAVA
 *
 *  Common inheritance types discussed in OOP theory:
 *  -------------------------------------------------
 *  1) Single Level Inheritance
 *  2) Multi Level Inheritance
 *  3) Hierarchical Inheritance
 *  4) Hybrid Inheritance
 *
 *  IMPORTANT NOTE ABOUT JAVA:
 *  --------------------------
 *  - Java supports:
 *        ✅ Single level inheritance (class A -> class B)
 *        ✅ Multi level inheritance (class A -> class B -> class C)
 *        ✅ Hierarchical inheritance (one parent -> many children)
 *        ✅ Multiple inheritance of TYPE (via interfaces)
 *        ✅ Hybrid inheritance (combination of above, but
 *           multiple inheritance of classes is NOT allowed.
 *
 *  - Java does NOT support:
 *        ❌ Multiple inheritance of CLASSES
 *           (i.e., class C extends A, B is NOT allowed).
 *
 *  In this file:
 *  -------------
 *  We will:
 *      - Reuse your Fish/Animal example for Single Level.
 *      - Show Multi Level using Animal -> Bird -> Eagle.
 *      - Show Hierarchical using Animal -> Dog and Animal -> Cat.
 *      - Show Hybrid using:
 *          Animal (class) + Pet (interface) + Swimmer (interface)
 *          + a subclass that extends Animal and implements BOTH interfaces.
 */

public class Inheritence {
    public static void main(String[] args) {

        // ============================
        // 1) SINGLE LEVEL INHERITANCE
        // ============================
        System.out.println("=== Single Level Inheritance ===");
        Fish f1 = new Fish(); // Fish is a child of Animal
        f1.setAnimal("Goldfish"); // method inherited from Animal
        f1.eat(); // method inherited from Animal
        f1.tunaCount(10); // method of Fish itself

        // ============================
        // 2) MULTI LEVEL INHERITANCE
        // ============================
        System.out.println("\n=== Multi Level Inheritance ===");
        Eagle e1 = new Eagle(); // Eagle -> Bird -> Animal
        e1.setAnimal("Golden Eagle"); // from Animal (top parent)
        e1.eat(); // from Animal
        e1.fly(); // from Bird (middle parent)
        e1.hunt(); // from Eagle (child)

        // ============================
        // 3) HIERARCHICAL INHERITANCE
        // ============================
        System.out.println("\n=== Hierarchical Inheritance ===");
        Dog d1 = new Dog(); // Dog and Cat BOTH extend Animal
        d1.setAnimal("Doggo");
        d1.eat(); // from Animal
        d1.bark(); // Dog's own behavior

        Cat c1 = new Cat();
        c1.setAnimal("Kitty");
        c1.eat(); // from Animal
        c1.meow(); // Cat's own behavior

        // ============================
        // 4) HYBRID INHERITANCE
        // ============================
        System.out.println("\n=== Hybrid Inheritance (using class + interfaces) ===");
        PetFish pf = new PetFish(); // PetFish: combination of class + multiple interfaces
        pf.setAnimal("Nemo");
        pf.eat(); // from Animal (class)
        pf.tunaCount(3); // from Fish (class)
        pf.playWithOwner(); // from Pet (interface)
        pf.swimFast(); // from Swimmer (interface)
    }
}

/*
 * ========================================================
 * 1) SINGLE LEVEL INHERITANCE
 * ========================================================
 * Definition:
 * -----------
 * - Single level inheritance means ONE parent class and ONE child class.
 * - There is only ONE level between parent and child.
 *
 * Example (below):
 * ----------------
 * class Animal -> Parent / Super class
 * class Fish extends Animal -> Child / Subclass
 *
 * Relationship:
 * Animal
 * ↑
 * Fish
 *
 * Fish inherits:
 * - 'AnimalName' variable
 * - 'eat()' method
 * - 'setAnimal()' method
 */

class Animal {
    // instance variable to store name of animal
    String AnimalName;

    // method common to all animals
    void eat() {
        System.out.println(AnimalName + " is eating");
    }

    // setter method to set animal name
    void setAnimal(String AnimalName) {
        // 'this.AnimalName' refers to the instance variable
        // 'AnimalName' (parameter) is the input value
        this.AnimalName = AnimalName;
    }
}

// Child class of Animal
class Fish extends Animal {
    int tuna;

    // Method specific to Fish (not available in parent class)
    void tunaCount(int tunaCount) {
        /*
         * Even though Fish doesn't declare AnimalName or eat(),
         * it can still use them because Fish "extends" Animal.
         * This is SINGLE LEVEL inheritance.
         */
        System.out.println("tuna count " + tunaCount);
    }
}

/*
 * ========================================================
 * 2) MULTI LEVEL INHERITANCE
 * ========================================================
 * Definition:
 * -----------
 * - Multi level inheritance means inheritance happening in a chain.
 * - Parent -> Child -> GrandChild
 *
 * Example (below):
 * ----------------
 * class Animal -> base parent
 * class Bird extends Animal
 * class Eagle extends Bird
 *
 * Relationship:
 * Animal
 * ↑
 * Bird
 * ↑
 * Eagle
 *
 * - Eagle indirectly inherits from Animal ALSO.
 */

class Bird extends Animal {
    // Bird-specific behavior
    void fly() {
        System.out.println(AnimalName + " is flying");
    }
}

// Eagle is a Bird, and Bird is an Animal
class Eagle extends Bird {
    // Eagle-specific behavior
    void hunt() {
        /*
         * Eagle can use:
         * - setAnimal() and eat() from Animal,
         * - fly() from Bird,
         * because of multi level inheritance:
         * Eagle -> Bird -> Animal
         */
        System.out.println(AnimalName + " is hunting");
    }
}

/*
 * ========================================================
 * 3) HIERARCHICAL INHERITANCE
 * ========================================================
 * Definition:
 * -----------
 * - Hierarchical inheritance means:
 * ONE parent class -> MULTIPLE child classes.
 *
 * Example (below):
 * ----------------
 * class Animal (parent)
 * ↑ ↑
 * Dog Cat (two separate child classes)
 *
 * Relationship:
 * Animal
 * / \
 * Dog Cat
 *
 * - Both Dog and Cat share the common properties of Animal
 * (like AnimalName, eat(), setAnimal()).
 */

class Dog extends Animal {
    // Dog-specific behavior
    void bark() {
        System.out.println(AnimalName + " is barking");
    }
}

class Cat extends Animal {
    // Cat-specific behavior
    void meow() {
        System.out.println(AnimalName + " is meowing");
    }
}

/*
 * ========================================================
 * 4) HYBRID INHERITANCE (Java style)
 * ========================================================
 * Definition:
 * -----------
 * - Hybrid inheritance is basically a COMBINATION of
 * more than one type of inheritance.
 *
 * For example:
 * - multi level + hierarchical
 * - single level + multiple inheritance (via interfaces)
 *
 * - However, JAVA DOES NOT SUPPORT multiple inheritance of CLASSES.
 * So we use INTERFACES to achieve "multiple inheritance of type".
 *
 * In this example:
 * ----------------
 * 1) Fish already extends Animal -> (single level)
 * 2) PetFish extends Fish -> (multi level)
 * 3) PetFish also implements Pet and Swimmer interfaces
 * -> (multiple inheritance of interfaces)
 *
 * Overall:
 * Animal (class)
 * ↑
 * Fish (class)
 * ↑
 * PetFish (class) implements Pet, Swimmer (interfaces)
 *
 * That combination (multi level + interfaces) is called
 * HYBRID INHERITANCE.
 */

// Interface 1: Pet-like behavior
interface Pet {
    void playWithOwner();
}

// Interface 2: Swimmer-like behavior
interface Swimmer {
    void swimFast();
}

// PetFish: extending a class AND implementing multiple interfaces
class PetFish extends Fish implements Pet, Swimmer {

    // @Override
    public void playWithOwner() {
        System.out.println(AnimalName + " is playing with its owner");
    }

    // @Override
    public void swimFast() {
        System.out.println(AnimalName + " is swimming fast");
    }
}
