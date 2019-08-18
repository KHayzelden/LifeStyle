
package lifestyle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class UsernameCheck 
{
    ArrayList<String> usernames;
    static String filename;
    int cipherMode;
    static SecretKey secretKey;
    static Cipher cipher;

    //uses the same process described in the save user class to encrypt a file storing the usernames that have
    //been taken to check for duplication on user registration
    
    public UsernameCheck ()
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
    
        filename = "users.txt";
    }
    
    public void save(ArrayList<String> tempUsernames)
    {
        this.usernames = tempUsernames;
        
        try 
        {
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            
            SealedObject sealedObject = new SealedObject(usernames, cipher);
            
            CipherOutputStream cipherOutputStream = new CipherOutputStream( new BufferedOutputStream( new FileOutputStream(filename)),cipher);
            
            ObjectOutputStream outputStream = new ObjectOutputStream(cipherOutputStream);
            
            outputStream.writeObject(sealedObject);
            
            outputStream.close();
            
            byte[] keyBtye = secretKey.getEncoded();
            
            //key saved in file called random to reduce risk of hacking
            FileOutputStream writeKey = new FileOutputStream("x56789876.txt");
            
            writeKey.write(keyBtye);
            writeKey.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<String> load()
    {
        ArrayList<String> loadedStrings = null;
        
        try
        {
            //key saved in file called random to reduce risk of hacking
            FileInputStream keyInputStream = new FileInputStream("x56789876.txt");
            byte[] encryptedKey = new byte[keyInputStream.available()];
            
            keyInputStream.read(encryptedKey);
            keyInputStream.close();
            
            Key loadedKey = new SecretKeySpec(encryptedKey, "AES");
            
            cipher.init(Cipher.DECRYPT_MODE,loadedKey);
            
            CipherInputStream cipherInputStream = new CipherInputStream(new BufferedInputStream(new FileInputStream(filename)),cipher);
            ObjectInputStream inputStream = new ObjectInputStream(cipherInputStream);
            
            SealedObject sealedObject = (SealedObject) inputStream.readObject();
            
            loadedStrings = (ArrayList<String>) sealedObject.getObject(cipher);
        }   
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return loadedStrings;
    }
}
