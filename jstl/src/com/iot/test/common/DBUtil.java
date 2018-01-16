package com.iot.test.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    public static void closeAll(ResultSet rs, PreparedStatement ps, Connection con) {
    }
    
    	public static void close(ResultSet rs) {    	
    	try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void close(Connection con) {
    	try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void close(PreparedStatement ps) {
    	try { 
    		ps.close();
    	} catch (SQLException e) {
			e.printStackTrace();
        }
    }
}
