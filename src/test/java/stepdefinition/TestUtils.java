package stepdefinition;
import java.util.Random;

public class TestUtils {
    public static String generateRandomString(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
    public static void main(String[] args) {
        String randomString = generateRandomString(8);
        System.out.println(randomString);
    }

}
