package indi.wrenn.studentsystem.dao;

public interface JdbcConfig {
    //接口中可以创建变量，但必须是public static final,但不用明显加，ide会自动默认加了这些前缀
    String DRIVER = "com.mysql.cj.jdbc.Driver";//连接mysql数据库
    String URL = "jdbc:mysql://localhost:3306/StudentSystemDao?serverTimezone=UTC";
    // JDBC URL 用于标识一个被注册的驱动程序，驱动程序管理器通过这个 URL 选择正确的驱动程序，从而建立到数据库的连接。
    String USERNAME = "root";
    String PASSWORD = "hsh123456";
}
