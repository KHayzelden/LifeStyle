
package lifestyle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SaveUser {
    
    User user;
    static String filename;
    int cipherMode;
    static SecretKey secretKey;
    static Cipher cipher;

    //for saving the user from a user object. Generates a random 128 bite key that is used to encrypt the data
    public SaveUser (User user)
    {
        try
        {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
            
            cipher = Cipher.getInstance("AES");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        this.user = user;
        
        filename = user.getUsername() + ".txt";
    }
    
    //for loading the user details from just a username. For before the password is confirmed. Generates a random 128 bite key
    //that is used to encrypt the data
    public SaveUser (String username)
    {
        try
        {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
            
            cipher = Cipher.getInstance("AES");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        filename = username + ".txt";
    }
    
    //loads the user that implements serilizable in order to load it into a sealed object,
    // encrypting it using the key generated earlier. The object is then written to the file
    //and the stream is closed. The key is saved for decryption in a seperate file
    public void saveEncrypted()
    {
        try 
        {
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            
            SealedObject sealedObject = new SealedObject( user, cipher);
            
            CipherOutputStream cipherOutputStream = new CipherOutputStream( 
                    new BufferedOutputStream( new FileOutputStream(filename)),cipher);
            
            ObjectOutputStream outputStream = new ObjectOutputStream(cipherOutputStream);
            
            outputStream.writeObject( sealedObject );
            
            outputStream.close();
            
            byte[] keyBtye = secretKey.getEncoded();
            
            //key saved in file called random to reduce risk of hacking
            FileOutputStream writeKey = new FileOutputStream("7482002.txt");
            
            writeKey.write(keyBtye);
            writeKey.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    //the reverse process of above is completed by loading the key then decrypting the file, returning the
    //resulting object (an instance of the user class)
    public static User loadEncrypted()
    {
        User loadedUser = null;
        
        try
        {
            //key saved in file called random to reduce risk of hacking
            FileInputStream keyInputStream = new FileInputStream("7482002.txt");
            byte[] encryptedKey = new byte[keyInputStream.available()];
            
            keyInputStream.read(encryptedKey);
            keyInputStream.close();
            
            Key loadedKey = new SecretKeySpec(encryptedKey, "AES");
            
            cipher.init(Cipher.DECRYPT_MODE,loadedKey);
            
            CipherInputStream cipherInputStream = new CipherInputStream(
                    new BufferedInputStream(new FileInputStream(filename)),cipher);
            
            ObjectInputStream inputStream = new ObjectInputStream(cipherInputStream);
            
            SealedObject sealedObject = (SealedObject) inputStream.readObject();
            
            loadedUser = (User) sealedObject.getObject(cipher);
        }   
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return loadedUser;
    }
}
