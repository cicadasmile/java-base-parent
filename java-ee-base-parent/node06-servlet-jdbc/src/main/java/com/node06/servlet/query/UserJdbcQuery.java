package com.node06.servlet.query;

import com.node06.servlet.bean.UserInfo;
import com.node06.servlet.config.C3P0Pool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserJdbcQuery {

    public static UserInfo queryUser (String userName){
        UserInfo userInfo = null ;
        try {
            Connection connection = C3P0Pool.getConnection();
            String sql = "SELECT * FROM user_info WHERE user_name=?" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userName);
            ResultSet resultSet = statement.executeQuery() ;
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("user_name");
                int age = resultSet.getInt("user_age");
                System.out.println("ID:"+id+";name:"+name+";age:"+age);
                userInfo = new UserInfo(name,age) ;
            }
            C3P0Pool.close(resultSet, statement, connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo ;
    }

    public static void main(String[] args) {
        queryUser("Liu");
    }
}
