package utililities;

import java.util.Random;

public class StringUtils {

    public static boolean isNullOrEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public static String getRandomNumber(int length) {
        String saltChar = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < length) {
            // length of the random string.
            int index = (int) (rand.nextFloat() * saltChar.length());
            salt.append(saltChar.charAt(index));
        }
        return salt.toString();
    }

    public static String getRandomString(int length) {
        String saltChar = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < length) { // length of the random string.
            int index = (int) (rand.nextFloat() * saltChar.length());
            salt.append(saltChar.charAt(index));
        }
        return salt.toString();
    }
}
