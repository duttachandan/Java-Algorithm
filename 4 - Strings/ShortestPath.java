
// Give a route containing 4 directions (E, W , N , S) find the shortest path to reach the destination

public class ShortestPath {
    public static long rootOfElm(double e, double power) {
        long value = (int) Math.pow(e, power);
        System.err.println(value);
        return value;
    }

    public static void shortestPathCalculator(String arg) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < arg.length(); i++) {
            if (arg.charAt(i) == 'N') {
                y++;
            }
            if (arg.charAt(i) == 'S') {
                y--;
            }
            if (arg.charAt(i) == 'W') {
                x--;
            }
            if (arg.charAt(i) == 'E') {
                x++;
            }
        }
        long shortDistance = (rootOfElm(x, 2) + rootOfElm(y, 2));
        System.err.println(shortDistance);
        // long distance = rootOfElm(shortDistance, 0.5);
        System.out.print(Math.pow(shortDistance, 0.5));
    }

    public static void main(String args[]) {
        shortestPathCalculator("NSWENENNE");
    }
}
