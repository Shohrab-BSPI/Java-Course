package com.spring5.practice.service;

import java.sql.Connection;

import java.sql.DriverManager;



import java.sql.PreparedStatement;


import org.springframework.stereotype.Service;

import com.spring5.practice.model.User;

@Service
public class UserStoreToDBMS {
	
	public void saveUser(User user) {
		try {
			Class.forName("org.postgresql.Driver");     //for postgresql jdbc driver class
            Connection con =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/users_info","postgres","sh0hr@b");

            String sql = "insert into public.users_data values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            //User user = new User();
     
            pstmt.setString(1, user.getSalutation());
            pstmt.setString(2, user.getFname());
            pstmt.setString(3, user.getLname());
            pstmt.setString(4, user.getUname());
            
            pstmt.executeUpdate();
            System.out.println(user.getFname());
            System.out.println("Success..!");
		}catch(Exception ex){
            ex.printStackTrace();}
		 
	}
}
