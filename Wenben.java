package com.jishou.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Wenben {
	public  void infile(String data) throws IOException {
		File file = new File("D:\\filedemo\\temp.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter fw = null;
		try {
			fw=new FileWriter(file,true);
			fw.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
	
	public  void  keepfile() throws SQLException, IOException {
		Connection conn=new DataBaseConnection().getConnection();
		String sql = "select * from Water";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		infile("ID\t"+"name"+"\t"+"lever\t"+"programme\t"+"\n");
		while (rs.next()) {
			for(int i=1;i<=4;i++)
				infile(rs.getString(i)+"\t");
				infile("\n");
		}
	}
}
