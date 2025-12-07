public class ConstructorExample {
    public static void main(String[] args) {
        // When we write: new Pen("red", "bigTip")
        // 1) Java allocates memory for the new object
        // 2) The constructor is automatically invoked
        // 3) Fields get initialized
        Pen p1 = new Pen("red", "bigTip");
    }
}

class Pen {

    String Color;
    String penType;

    // Multiline text block (Java 15+)
    String info = """
            A constructor is called automatically when you create an object
            using new Pen().

            The constructor runs immediately after Java allocates memory
            for the new object.

            If you do not define any constructor,
            Java compiler automatically provides a default constructor.
            """;

    // Parameterized constructor
    Pen(String Color, String penType) {
        // Print explanation
        System.out.println(info);

        // Assigning values using 'this'
        this.Color = Color;
        this.penType = penType;

        // Showing assigned values
        System.out.println("Pen Created → Color: " + this.Color + ", Type: " + this.penType);
    }
}
