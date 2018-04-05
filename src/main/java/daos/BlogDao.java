package daos;

import config.App;
import config.App;
import config.Database;
import config.Database;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Blog;

public class BlogDao {
  public void insertar(){
    try {
      Blog instance = new Blog();
      instance.setHostname("ec2-54-191-11");
      instance.setPrivateKey("b87eb02f5dd7e5232d7b0fc30a5015e4");
      Database db = new  Database();
      db.getJsonDBTemplate().insert(instance);
    } catch (GeneralSecurityException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void listar(){
    try {
      Database db = new  Database();
      List<Object> findAll = db.getJsonDBTemplate().findAll("blogs");
      System.out.println(findAll);
    } catch (GeneralSecurityException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
