package indi.wrenn.studentsystem.dao;

public interface JdbcConfig {
    //�ӿ��п��Դ�����������������public static final,���������Լӣ�ide���Զ�Ĭ�ϼ�����Щǰ׺
    String DRIVER = "com.mysql.cj.jdbc.Driver";//����mysql���ݿ�
    String URL = "jdbc:mysql://localhost:3306/StudentSystemDao?serverTimezone=UTC";
    // JDBC URL ���ڱ�ʶһ����ע������������������������ͨ����� URL ѡ����ȷ���������򣬴Ӷ����������ݿ�����ӡ�
    String USERNAME = "root";
    String PASSWORD = "hsh123456";
}
