package ch13;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sound.midi.Soundbank;

import java.sql.Connection;

public class S01 {
    public static void main(String[] args) {
        // 자바와 db를 연결하는 객체
        Connection connection = null;

        // 3306까지가 데이터베이스시스템 / hr위치가 데이터베이스
        String url = "jdbc:mariadb://localhost:3306/hr";

        try {
            connection = DriverManager.getConnection(
                url, 
                "root", 
                "1234"
            );
        } catch (SQLException e) {
            System.out.println("디비 연결 중 오류가 발생했습니다.");
        }

        // 쿼리문 날리기
        String sql = "select first_name from employees where employee_id = ?";

        PreparedStatement prepareStatement = null;

        try {
            prepareStatement = connection.prepareStatement(sql);  
            prepareStatement.setInt(1, 100);  
        } catch (Exception e) {
            System.out.println("디비 사용중 오류가 발생했습니다.");
        }

        ResultSet resultSet = null;

        try {
            resultSet = prepareStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("쿼리 실행 중 오류가 발생했습니다.");
            System.out.println(e.getMessage());
            return;
        }

        // 데이터 자바로 변환'

        
        try {
            if (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (Exception e) {
            System.out.println("데이터 변환 중 오류가 발생했습니다.");
        }

        try {
            // connection은 무조건 닫아줘야 함
            // null 체크
            if (connection != null) {
                connection.close();
            }
            if (prepareStatement != null) {
                prepareStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception e) {
            System.out.println("연결 종료 중 오류가 발생했습니다.");
        }
    }
}
