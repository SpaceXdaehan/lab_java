package edu.java.contact.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;
import oracle.jdbc.OracleDriver;

import static edu.java.contact.model.Contact.Entity.*;
import static edu.java.contact.ojdbc.OracleConnect.*;

public class ContactDaoImpl implements ContactDao {
    
    // singleton
    private static ContactDaoImpl instance = null;
    private ContactDaoImpl() {}
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        
        return instance;
    }

    // 오라클 DB에 접속한 Connection 객체를 리턴.
    private Connection getConnection() throws SQLException {
        // 오라클 JDBC 드라이버(라이브러리)를 등록.
        DriverManager.registerDriver(new OracleDriver());
        // 오라클 DB에 접속.
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        
        return conn;
    }
    
    private void closeResources(Connection conn, Statement stmt) throws SQLException {
        stmt.close();
        conn.close();
    }
    
    private void closeResources(Connection conn, Statement stmt, ResultSet rs) 
            throws SQLException {
        rs.close();
        closeResources(conn, stmt);
    }
    
    // select * from contacts order by cid;
    private static final String SQL_SELECT_ALL = 
            "select * from " + TBL_NAME + " order by " + COL_CID;
    
    @Override
    public List<Contact> read() {
        ArrayList<Contact> list = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            System.out.println(SQL_SELECT_ALL);
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) { // select 결과에서 행(row) 데이터가 있으면
                // 각 컬럼의 값들을 읽음.
                int cid = rs.getInt(COL_CID);
                String name = rs.getString(COL_NAME);
                String phone = rs.getString(COL_PHONE);
                String email = rs.getString(COL_EMAIL);
                
                Contact contact = new Contact(cid, name, phone, email);
                list.add(contact);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt, rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return list;
    }

    @Override
    public Contact read(Integer cid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int create(Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Integer cid) {
        // TODO Auto-generated method stub
        return 0;
    }

}
