package Mesa13;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDentista {

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/testDentista4", "sa", "");
    }
}
