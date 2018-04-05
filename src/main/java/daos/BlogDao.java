package daos;

import config.Database;
import java.util.List;
import models.Blog;

public class BlogDao extends Database{
  public BlogDao() throws Exception { }
    
  public void insertar(Blog instance) throws Exception{
    try {
      Database db = new  Database();
      db.getJsonDBTemplate().insert(instance);
    } catch (Exception ex) {
      throw ex;    
    }
  }
  
  public void listar() throws Exception{
    try {
      Database db = new  Database();
      List<Object> findAll = db.getJsonDBTemplate().findAll("blogs");
      System.out.println(findAll);
    } catch (Exception ex) {
      throw ex;
    }
  }
}
