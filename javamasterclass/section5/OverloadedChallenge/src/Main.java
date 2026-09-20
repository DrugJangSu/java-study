public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));

    }
    public static double convertToCentimeters(int inch) {
        return inch * 2.54;

    }
    public static double convertToCentimeters(int foot, int inch) {
        return convertToCentimeters((foot * 12 + inch));
    }
}
