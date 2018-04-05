package config;

import io.jsondb.JsonDBTemplate;
import io.jsondb.crypto.DefaultAESCBCCipher;
import io.jsondb.crypto.ICipher;
import java.security.GeneralSecurityException;
import org.bson.types.ObjectId;

public class Database {
    protected JsonDBTemplate jsonDBTemplate;

    public Database() throws GeneralSecurityException {
      String dbFilesLocation = "db/";
      String baseScanPackage = "model";
      ICipher cipher = new DefaultAESCBCCipher("1r8+24pibarAWgS85/Heeg==");
      this.jsonDBTemplate = new JsonDBTemplate(dbFilesLocation, baseScanPackage, cipher);
    }

    public JsonDBTemplate getJsonDBTemplate() {
        return jsonDBTemplate;
    }
    
    protected String generateId(){
      ObjectId id = new ObjectId();
      return id.toString();
    }
}
