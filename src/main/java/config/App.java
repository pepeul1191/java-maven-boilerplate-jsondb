package config;

import io.jsondb.JsonDBTemplate;
import io.jsondb.crypto.DefaultAESCBCCipher;
import io.jsondb.crypto.ICipher;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Blog;

public class App {
  public static void main(String[] args) {
    String dbFilesLocation = "db/";
    String baseScanPackage = "model";
    ICipher cipher;
    try {
        cipher = new DefaultAESCBCCipher("1r8+24pibarAWgS85/Heeg==");
        JsonDBTemplate jsonDBTemplate = new JsonDBTemplate(dbFilesLocation, baseScanPackage, cipher);
        Blog instance = new Blog();
        //instance.setId("11");
        instance.setHostname("ec2-54-191-11");
        instance.setPrivateKey("b87eb02f5dd7e5232d7b0fc30a5015e4");
        //jsonDBTemplate.createCollection(Blog.class);
        jsonDBTemplate.insert(instance);
    } catch (GeneralSecurityException ex) {
        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }    
}
