package daos;

import config.Database;
import java.util.List;
import models.Blog;
import org.bson.types.ObjectId;

public class BlogDao extends Database{
  public BlogDao() throws Exception {
    if(this.jsonDBTemplate.collectionExists(Blog.class) == false){
      this.jsonDBTemplate.createCollection(Blog.class);
    }
  }
    
  public String insertar(Blog doc) throws Exception{
    try {
      doc.setId(this.generateId());
      this.getJsonDBTemplate().insert(doc);
      return doc.getId();
    } catch (Exception ex) {
      throw ex;    
    }
  }
  
  public void listar() throws Exception{
    try {
      List<Object> docs = this.getJsonDBTemplate().findAll("blogs");
      for (Object doc : docs) {
        System.out.println(doc);
      }
    } catch (Exception ex) {
      throw ex;
    }
  }
}
