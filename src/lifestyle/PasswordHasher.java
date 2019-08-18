
package lifestyle;

import java.security.*;

public class PasswordHasher 
{
    public PasswordHasher () {}
    
    public static String makeHash(String password)
    {
        String passwordHash = "";
        
        //uses the SHA1 algorithm to hash the given string and returns the hash
        try
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");

            byte[] results = messageDigest.digest(password.getBytes());

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0 ; i < results.length; i++ )
            {
                stringBuilder.append(Integer.toString((results[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            passwordHash = stringBuilder.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return passwordHash;
    }
    
}
