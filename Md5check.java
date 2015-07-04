/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md5check;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javafx.fxml.FXML;

/**
 *
 * @author Anmolpreet Sandhu
 */
public class Md5check {

   @FXML
    public static String md5(String password)
    {
    		try {
    		MessageDigest md = MessageDigest.getInstance("MD5");
        	md.update(password.getBytes());
        	byte bData[] = md.digest();
        	
        	StringBuffer buf = new StringBuffer();
        	for(int i = 0; i<bData.length; i++)
        	{
        		buf.append(Integer.toString((bData[i] & 0xff) + 0x100, 16).substring(1));
        	}
                return buf.toString();
    	}
    	catch(NoSuchAlgorithmException ae) {
    		ae.printStackTrace();
    	}
        return "";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String pass = "anmol";
        System.out.println(pass);
        
        String passCheck;
        passCheck = md5(pass);
        System.out.println(passCheck);
        
        
    }
    
}
