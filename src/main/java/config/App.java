package config;

import daos.BlogDao;
import models.Blog;

public class App {
  public static void main(String[] args) {
      Blog instance = new Blog();
      instance.setHostname("ec2-54-191-11");
      instance.setPrivateKey("b87eb02f5dd7e5232d7b0fc30a5015e4");
      try {
        BlogDao g = new BlogDao();
        String id = g.insertar(instance);
        System.out.println("El id generado es : " + id);
        g.listar();
      } catch (Exception ex) {
        System.out.println(ex.toString());
      }
  }
}
