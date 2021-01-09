package com.jishou.pojo;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.jishou.dao.DataBaseConnection;
public class Delete {
	public static void delete(String ID) throws SQLException {
		Connection conn=new DataBaseConnection().getConnection();
		String sql="delete from Water where ID=?";   //SQL语句
		PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,ID);
        pstmt.executeUpdate();
        String sql1="select * from Water";
        PreparedStatement pstmt1=conn.prepareStatement(sql1);
        ResultSet rs=pstmt1.executeQuery();
		if (!rs.next()) {
			JOptionPane.showMessageDialog(null, "无该用户的数据，删除失败！", null, 2);
		} else {
			JFrame f = new JFrame("删除后的水资源数据");
			f.setSize(500, 600);
			f.setLocation(500, 100);
			f.setLayout(new BorderLayout());
			Vector rowData, columnNames, line1;
			columnNames = new Vector();
			columnNames.add("ID");
			columnNames.add("name");
			columnNames.add("lever");
			columnNames.add("programme");
			rowData = new Vector();
			while (rs.next()) {
				line1 = new Vector();
				line1.add(rs.getString(1));
				line1.add(rs.getString(2));
				line1.add(rs.getString(3));
				line1.add(rs.getString(4));
				rowData.add(line1);
			}
			JTable t = new JTable(rowData, columnNames);
			JScrollPane sp = new JScrollPane(t);
			f.add(sp);
			f.setVisible(true);
			conn.close();
			pstmt.close();
        }
	}
}