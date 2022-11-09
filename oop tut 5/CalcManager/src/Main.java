class CalcManager {
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
    public static int cube(int n) {
        return n*n*n;
    }
    public static double add(double...x) {
        double sum = 0.0;
        for (double e : x)
            sum = sum + e;
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        double sum1 = CalcManager.add(2.1, 5.6);
        System.out.println("sum1 = " + sum1);
        double sum2 = CalcManager.add(7.9, 1.3);
        System.out.println("sum2 = " + sum2);
        System.out.println("isEven(4): " + CalcManager.isEven(4));
        System.out.println("isEven(7): " + CalcManager.isEven(7));
        System.out.println("cube(3): " + CalcManager.cube(3));
        System.out.println("cube(10): " + CalcManager.cube(10));
    }
}