package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class S02 {
    public static void main(String[] args) throws SQLException{
        // try 밖에서도 쓸 수 있게 선언만 해줌
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            
            // db연결주소
            String url = "jdbc:mariadb://localhost:3306/hr";
            // db연결
            connection = DriverManager.getConnection(url, "root", "1234");
            // 쿼리문 준비
            String sql = "select * from employees where salary > 10000";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
            // 쿼리문 실행
            resultSet = preparedStatement.executeQuery();
            // 결과값 확인
            List<Emp> list = new ArrayList<>();
            while (resultSet.next()) {
                Emp emp = new Emp(
                    resultSet.getInt("employee_id"),
                    resultSet.getString("first_name"),
                    resultSet.getInt("salary")
                );
                list.add(emp);
            }
            System.out.println(list);
            
            // if (resultSet.next()) {
            //     Emp emp = new Emp(
            //         resultSet.getInt("employee_id"),
            //         resultSet.getString("first_name"),
            //         resultSet.getInt("salary")
            //     );
            //     System.out.println(emp);
            // }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // connection은 무조건 닫아줘야 함
            // null 체크
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }

    }
}
