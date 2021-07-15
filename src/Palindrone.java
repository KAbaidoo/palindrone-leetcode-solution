import java.util.Locale;

public class Palindrone {

    //driver class
    public static void main(String[] args) {
        System.out.println(isPalindrone("amana Planac Analp  anama"));
    }

    private static boolean isPalindrone(String str) {
    //        removing the spaces and converting to lower case
        str = str.replaceAll("\\s", "").toLowerCase();

    //        check if the sequence of characters from opposite sides match
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
