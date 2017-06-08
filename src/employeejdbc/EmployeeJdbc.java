/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeejdbc;

import java.sql.*;

public class EmployeeJdbc {

    public static void main(String[] args) {
      Connection con;
      Statement stm;
      ResultSet rlt;
      try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Empployee","em","em");
          
          stm = con.createStatement();
          rlt = stm.executeQuery("select * from Employee");
          
          while(rlt.next()){
              int id = rlt.getInt("EmpId");
              String  name = rlt.getString("EmpName");
              int age = rlt.getInt("EmpAge");
              
              System.out.println("name:\t" +name);
              System.out.println("id:\t"+id);
              System.out.println("age:\t"+age);
          }
      
      
      }catch (Exception ee){
          System.out.println(ee);
      }
        
                                                                                                                                                                                                                                                   
    }
    
}
