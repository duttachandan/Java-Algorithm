public class InterfacesExample {
    public static void main(String args[]) {

        Queen q1 = new Queen();
        q1.Move();

        // Multiple Inheritance using interfaces
        Rook r1 = new Rook();
        r1.Move();
        r1.Name();
    }
}

// --------------------------------------------------------
// Why use interface?
// --------------------------------------------------------
// Interfaces provide 100% abstraction (before Java 8).
// A class can implement multiple interfaces,
// which means interfaces allow MULTIPLE INHERITANCE in Java.
// Abstract classes do NOT allow multiple inheritance.

// --------------------------------------------------------
// Interface 1
interface ChessRules {
    public void Move(); // abstract method (by default)
}

// Interface 2
interface ChessMove {
    public void Name(); // abstract method (by default)
}

// --------------------------------------------------------
// A class implementing ONE interface
class Queen implements ChessRules {

    // Must override Move() because interface methods are abstract
    public void Move() {
        System.err.println("Moves: up, down, left, right, diagonal");
    }
}

// --------------------------------------------------------
// A class implementing MULTIPLE interfaces
class Rook implements ChessRules, ChessMove {

    public void Move() {
        System.err.println("Moves: vertical and horizontal only");
    }

    public void Name() {
        System.err.println("I am Rook");
    }
}
