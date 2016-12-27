package ua.spalah.tips;

public class VarArgsTips {

    public static void main(String[] args) {
        double max1 = max(1, 3, 4, 15, -522);
        double max2 = max(81);
        double max3 = max(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 555, 1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }

    public static double max(double... values) {
//        double[] valuesAgain = values;
        double largest = Double.MIN_VALUE;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }

}
