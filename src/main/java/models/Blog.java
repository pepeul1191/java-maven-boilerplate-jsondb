package models;

import io.jsondb.annotation.Document;
import io.jsondb.annotation.Id;
import io.jsondb.annotation.Secret;

@Document(collection = "blogs", schemaVersion= "1.0")
public class Blog {
  @Id
  private String id;
  private String hostname;
  @Secret
  private String privateKey;

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getHostname() { return hostname; }
  public void setHostname(String hostname) { this.hostname = hostname; }
  public String getPrivateKey() { return privateKey; }
  public void setPrivateKey(String privateKey) { this.privateKey = privateKey; }
  @Override
  public String toString() {
    return "Blog{" + "id=" + id + ", hostname=" + hostname + ", privateKey=" + privateKey + '}';
  }
}
