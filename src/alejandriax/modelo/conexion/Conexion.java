/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 31/07/2014
 */

package alejandriax.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author JoséDavid 31/7/2014
 */

//CLASE DE CONEXION CON MYSQL

public class Conexion {
	   static String bd = "alejandriax";
	   static String login = "root";
	   static String password = "";
	   static String url = "jdbc:mysql://127.0.0.1:3306/" + bd;

	   Connection conn = null;

	   /** Constructor de DbConnection */
	   public Conexion() {
	      try{
	         //obtenemos el driver de para mysql
	         Class.forName("com.mysql.jdbc.Driver");
	         //obtenemos la conexión
	         conn = DriverManager.getConnection(url,login,password);

	         if (conn!=null){
//	            System.out.println("Conección a base de datos "+bd+" OK");
	         }
	      }
	      catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }catch(Exception e){
	         System.out.println(e);
	      }
	   }
	   /**Permite retornar la conexión*/
	   public Connection getConnection(){
	      return conn;
	   }

	   public void desconectar(){
	      conn = null;
	   }

	}






