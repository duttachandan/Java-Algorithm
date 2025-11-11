import java.util.*;

public class Practice_1_BillGenerator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first Item name");
        String Item1 = sc.nextLine();
        System.out.println("Enter the Price of that Item");
        float Item1Price = sc.nextFloat();
        sc.nextLine();
        System.out.println("enter the Second Item name");
        String Item2 = sc.nextLine();
        System.out.println("Enter the Price of that Item");
        float Item2Price = sc.nextFloat();
        sc.nextLine();
        System.out.println("enter the Third Item name");
        String Item3 = sc.nextLine();
        System.out.println("Enter the Price of that Item");
        float Item3Price = sc.nextFloat();

        System.out.println(Item1 + " " + "is your First item and its price is" + " " + Item1Price);
        System.out.println(Item2 + " " + "is your First item and its price is" + " " + Item2Price);
        System.out.println(Item3 + " " + "is your First item and its price is" + " " + Item3Price);

        float totalCost = (Item1Price + Item2Price + Item3Price);

        float gstAmount = totalCost * 0.18f;

        float totalAmount = totalCost + gstAmount;

        System.out.println("total cost You have with including 18% GST" + " " + totalAmount);
        sc.close();
    }
}