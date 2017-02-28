package ua.spalah.tips;

public class EnumTips {


    public static void main(String[] args) {
        Size small = Size.SMALL;
        System.out.println(small);

        String largeAsString = Size.LARGE.toString();
        System.out.println(largeAsString);

        String mediumAbbr = Size.MEDIUM.getAbbreviation();
        System.out.println(mediumAbbr);

        Size[] sizes = Size.values();
        for (Size size : sizes) {
            System.out.println(size + " - " + size.getAbbreviation());
        }

        String xlAsString = "EXTRA_LARGE";
//        Size xl = Enum.valueOf(Size.class, xlAsString);
        Size xl = Size.valueOf(xlAsString);
        System.out.println("Parsed size - " + xl.getAbbreviation() + " - " + xl);
    }
}
