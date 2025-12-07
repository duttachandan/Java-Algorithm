
public class BasicClass {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.ChangeColor("red");
        p1.ChangeTip(2);
        System.err.println(p1.color);
        System.err.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void ChangeColor(String newColor) {
        color = newColor;
    }

    void ChangeTip(int newTip) {
        tip = newTip;
    }
}
