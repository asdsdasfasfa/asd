package com.jishou.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jishou.pojo.Insert;
import com.jishou.pojo.Query;
import com.jishou.ui.GUI;
public class query {
	public void query() throws SQLException{
	JFrame display_page = new JFrame("张家界水资源污染治理信息管理系统");
	display_page.setResizable(false);
	display_page.setSize(600, 600); // 设置窗口的大小
	display_page.setLayout(null); // 设置程序默认布局格式为空，以便于后期自己简单的设置布局
	display_page.setResizable(false); // 设置不可缩放
	// 给主页设置位置
	display_page.setLocation(400, 200);
	// 给主页设置大小
	display_page.setSize(600, 600);
	// 设置主页能够关闭，并且登录成功后将登录页面隐藏
	display_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	display_page.setVisible(true);
	JLabel Menu4_label = new JLabel("查看水资源信息");
	JLabel Id4_label = new JLabel("请输入ID");
	final JTextField ID4_field = new JTextField();
	JButton return4_btn = new JButton("返回");
	JButton sure4_btn = new JButton("确定");
	JButton exit5_btn = new JButton("退出系统");
	// 设置各个标签和输入框的大小和位置
	Menu4_label.setBounds(250, 75, 100, 100);
	Id4_label.setBounds(180, 200, 200, 50);
	ID4_field.setBounds(300, 210, 80, 25);
	return4_btn.setBounds(120, 400, 100, 50);
	sure4_btn.setBounds(250, 400, 100, 50);
	exit5_btn.setBounds(380, 400, 100, 50);
	// 添加到面板
	display_page.add(Menu4_label);
	display_page.add(Id4_label);
	display_page.add(ID4_field);
	display_page.add(return4_btn);
	display_page.add(sure4_btn);
	display_page.add(exit5_btn);
	// 退出系统按钮的监听器
	return4_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			display_page.setVisible(false);
		}
	});
	sure4_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			try {
				new Query().query(ID4_field.getText());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	exit5_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	});
  }
}
