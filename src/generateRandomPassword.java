
import java.security.SecureRandom;
import java.util.Random;

public class generateRandomPassword {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET= "0123456789abcdefghijklmnopqrstuvwxyz";
  
    public static String generatePassword(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
      public static void main(String[] args) {
        
        int passwordLength = 5;
        
        
        String password = generatePassword(passwordLength);
        
   
  
        System.out.println("Secure password: " + password);
    }
}