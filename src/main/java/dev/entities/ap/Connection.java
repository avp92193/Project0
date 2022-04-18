package dev.entities.ap;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.jupiter.api
public class Connectionutil {
     static Connection createconnection(){
          try {
               Connection conn= DriverManager.getConnection(url: "padron-db.cnzs29yyfx7v.us-east-2.rds.amazonaws.com/padrondb?user=postgres&password=Avp6945!");
          } catch SQLexception e) {
               e.printStackTrace();
               return null;
          }
     }


}
