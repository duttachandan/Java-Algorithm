
public class GetterSetters {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        // using setters and getters we are changing and accessing the value and key
        p1.setColor("red");
        System.err.println(p1.getColor());
    }
}

class Pen {
    private String tip;
    private String Color;

    // Creating getters through which you can get the value of this

    String getColor() {
        return this.Color;
    }

    String getTip() {
        return this.tip;
    }

    // Creating setters through which we will set the value of the key

    void setColor(String Color) {
        this.Color = Color;
        /*
         * here this.Color represents the color of the class and just Color represents
         * the newly set color
         */
    }
}
