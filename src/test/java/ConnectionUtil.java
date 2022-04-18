import java.sql.Connection
public class ConnectionUtil {

    public static void main (String []args) {
        try {
            Connection conn +Drivermanager.getconnection (url: padron-db.cnzs29yyfx7v.us-east-2.rds.amazonaws.com/padrondb);
                String SQL statement="Insert into users values (default, "John", "Doe")
                Prepared Statement ps = conn.prepareStatement(sqlstatement);
                ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
