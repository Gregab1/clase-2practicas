import java.sql.*;

public class pruebamql {
    public static void main(String[] args) {
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/practicas_2","root","" );
       /*PreparedStatement prepatre=conn.prepareStatement("Select *from alumnos;");
       ResultSet resul=prepatre.executeQuery();
       while (resul.next()){
           System.out.println(resul.getString("Nombre"));
       }*/

      /* PreparedStatement preparedStatementinsert=conn.prepareStatement("INSERT INTO alumnos VALUES(?,?,?,?)");
       preparedStatementinsert.setString(1,"Alejandro");
            preparedStatementinsert.setString(2,"Lopez");
            preparedStatementinsert.setString(3,"3967021");
            preparedStatementinsert.setString(4,"55");
         preparedStatementinsert.executeUpdate();*/
         PreparedStatement actualizar= conn.prepareStatement("UPDATE alumnos SET Nombre=?, Apellido=?, Edad=? WHERE DNI=?");
         actualizar.setString(1,"Gallardo");
            actualizar.setString(2,"marcelo");
            actualizar.setString(3,"88");
            actualizar.setString(4,"678952");
         actualizar.executeUpdate();
       conn.close();
       //resul.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
