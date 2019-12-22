package com.node06.servlet.query;

import com.node06.servlet.config.C3P0Pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserJdbcDelete {

    public static void deleteUser (Integer id){
        try {
            Connection connection = C3P0Pool.getConnection();
            String sql = "DELETE FROM user_info WHERE id=?" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.executeUpdate() ;
            C3P0Pool.close(null, statement, connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        deleteUser(5);
    }
}
