import javax.crypto.*;

public class AES_Example 
{
    public static void main(String[] args) throws Exception 
    {

    	String plaintext = "Hi from CS-2365 section1";
        System.out.println(plaintext);

        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();

        // Initialize Cipher for Encryption
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt 
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
        String encryptedText = new String(encryptedBytes); 
        System.out.println(encryptedText);

        // Initialize Cipher for Decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decrypt 
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedBytes);

        System.out.println(decryptedText);
    }
}
