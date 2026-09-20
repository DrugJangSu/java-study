public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(200));
        System.out.println(getDurationString(350, 25));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value detected. the value should be 0 or above.");
            return "";
        }   else {
            return getDurationString(seconds/60, seconds%60);
        }
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value detected. the value should be 0 or above, and seconds shouldn't exceed 59.");
            return "";
        } else {

            return ((minutes/60)+ "h " + (minutes%60 + seconds/60) +"m " + (seconds%60) + "s");
        }
    }
}