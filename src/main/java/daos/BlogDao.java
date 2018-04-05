package daos;

import config.Database;
import java.util.List;
import models.Blog;

public class BlogDao extends Database{
  public BlogDao() throws Exception {
    if(this.jsonDBTemplate.collectionExists(Blog.class) == false){
      this.jsonDBTemplate.createCollection(Blog.class);
    }
  }
    
  public void insertar(Blog instance) throws Exception{
    try {
      System.out.println("ANTES");
      System.out.println(instance);
      this.getJsonDBTemplate().upsert(instance);
      //this.getJsonDBTemplate().save(instance, Blog.class);
      System.out.println("DESPUES");
      System.out.println(instance);
      System.out.println("++++++++++++++++++++++++++++");
    } catch (Exception ex) {
      throw ex;    
    }
  }
  
  public void listar() throws Exception{
    try {
      List<Object> findAll = this.getJsonDBTemplate().findAll("blogs");
      System.out.println(findAll);
    } catch (Exception ex) {
      throw ex;
    }
  }
}
