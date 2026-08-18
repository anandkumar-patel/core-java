package anand.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class PasswordSaveDemo {
	public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = "bhabani";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        String newStr = new String(md.digest());
        System.out.println(newStr);
        //This below string is created for the first time
        System.out.println(newStr.equals("��w	���Yh��(N0"));
    }
}