package com.node06.servlet.query;

import com.node06.servlet.bean.UserInfo;
import com.node06.servlet.config.C3P0Pool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UserJdbcInsert {

    public static void insertUser (UserInfo userInfo){
        try {
            Connection connection = C3P0Pool.getConnection();
            String sql = "INSERT INTO user_info (user_name,user_age) VALUES (?,?)" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUserName());
            statement.setString(2,userInfo.getUserAge().toString());
            statement.execute() ;
            C3P0Pool.close(null, statement, connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batchInsertUser (List<UserInfo> userInfoList){
        try {
            Connection connection = C3P0Pool.getConnection();
            String sql = "INSERT INTO user_info (user_name,user_age) VALUES (?,?)" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            for (UserInfo userInfo:userInfoList){
                statement.setString(1,userInfo.getUserName());
                statement.setString(2,userInfo.getUserAge().toString());
                statement.addBatch();
            }
            statement.executeBatch() ;
            C3P0Pool.close(null, statement, connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<UserInfo> userInfoList = new ArrayList<>() ;
        userInfoList.add(new UserInfo("Wang",13)) ;
        userInfoList.add(new UserInfo("Liu",17)) ;
        batchInsertUser(userInfoList);
    }
}
