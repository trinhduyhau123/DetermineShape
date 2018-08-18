public class DetermineShape {

    public static int Shape(int a, int b, int c) {
        if (a + b < c || b + c < a || c + a < b || a < 1 || b < 1 || c < 1) {
            return -1;
        } else {
            if (a == b && b == c) {
                return 3;
            } else if (Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0) ||
                    Math.pow(b, 2.0) + Math.pow(c, 2.0) == Math.pow(a, 2.0) ||
                    Math.pow(a, 2.0) + Math.pow(c, 2.0) == Math.pow(b, 2.0)) {
                return 2;
            }
            return 1;
        }
    }
}
