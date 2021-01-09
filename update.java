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
import com.jishou.pojo.Update;
import com.jishou.ui.GUI;

public class update {
	public void update()  throws SQLException{
	JFrame read_page = new JFrame("张家界水资源污染治理信息管理系统");
	read_page.setSize(600, 600); // 设置窗口的大小
	read_page.setLayout(null); // 设置程序默认布局格式为空，以便于后期自己简单的设置布局
	read_page.setResizable(false); // 设置不可缩放
	// 给主页设置位置
	read_page.setLocation(400, 200);
	// 给主页设置大小
	read_page.setSize(600, 600);
	// 设置主页能够关闭，并且登录成功后将登录页面隐藏
	read_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	read_page.setVisible(true);
	// 声明标签，按钮，
	JLabel Menu3_label = new JLabel("修改水资源信息");
	JLabel Id3_label = new JLabel("ID");
	JLabel name3_label = new JLabel("name");
	JLabel programme3_label=new JLabel("programme");
	JLabel level3_label=new JLabel("level");
	final JTextField ID3_field = new JTextField();
	//final JTextField xiugaiID_field = new JTextField();
	final JTextField name3_field = new JTextField();
	final JTextField programme3_field = new JTextField();
	final JTextField level3_field=new JTextField();
	JButton return3_btn = new JButton("返回");
	JButton sure3_btn = new JButton("确定");
	JButton exit4_btn = new JButton("退出系统");
	// 设置各个标签和输入框的大小和位置
	Menu3_label.setBounds(250, 50, 100, 100);
	Id3_label.setBounds(200, 230, 200, 50);
	name3_label.setBounds(200,150, 100, 50);
	programme3_label.setBounds(200, 270, 100, 50);
	level3_label.setBounds(200,190, 100, 50);
	//iugaiID_field.setBounds(300, 120, 80, 25);
	ID3_field.setBounds(300, 160, 80, 25);
	name3_field.setBounds(300, 200, 80, 25);
	programme3_field.setBounds(300,280,80,25);
	level3_field.setBounds(300,240,80,25);
	return3_btn.setBounds(120, 500, 100, 50);
	sure3_btn.setBounds(250, 500, 100, 50);
	exit4_btn.setBounds(380, 500, 100, 50);
	// 添加到面板
	read_page.add(Menu3_label);
	read_page.add(Id3_label);
	read_page.add(name3_label);
	read_page.add(programme3_label);
	read_page.add(level3_label);
	read_page.add(ID3_field);
	read_page.add(name3_field);
	read_page.add(programme3_field);
	read_page.add(level3_field);
	read_page.add(return3_btn);
	read_page.add(sure3_btn);
	read_page.add(exit4_btn);
	return3_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			read_page.setVisible(false);
		}
	});
	sure3_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			try {
				new Update().update(ID3_field.getText(), name3_field.getText(),programme3_field.getText(),level3_field.getText());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	exit4_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	});
}
}