package com.node06.servlet.query;

import com.node06.servlet.config.C3P0Pool;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserJdbcUpdate {

    public static void updateUser (String name,Integer age,Integer id){
        try {
            Connection connection = C3P0Pool.getConnection();
            String sql = "UPDATE user_info SET user_name=?,user_age=? WHERE id=?" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            statement.setInt(2,age);
            statement.setInt(3,id);
            statement.executeUpdate() ;
            C3P0Pool.close(null, statement, connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateUser("Zhang",23,1);
    }
}
