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
import com.jishou.ui.GUI;

public class insert {
	public static void insert() throws SQLException {
		JFrame write_page = new JFrame("张家界水资源污染治理信息管理系统");
		write_page.setResizable(false);
		write_page.setSize(600, 600); // 设置窗口的大小
		write_page.setLayout(null); // 设置程序默认布局格式为空，以便于后期自己简单的设置布局
		write_page.setResizable(false); // 设置不可缩放
		// 给主页设置位置
		write_page.setLocation(400, 200);
		// 给主页设置大小
		write_page.setSize(600, 600);
		// 设置主页能够关闭，并且登录成功后将登录页面隐藏
		write_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		write_page.setVisible(true);
		//home_page.setVisible(false);
		// setVisible(false);//登录页面隐藏
		// 声明标签，按钮，
		JLabel Menu1_label = new JLabel("添加水资源信息");
		JLabel Id1_label = new JLabel("ID");
		JLabel name1_label = new JLabel("name");
		JLabel programme1_label=new JLabel("programme");
		JLabel level1_label=new JLabel("level");
		final JTextField ID1_field = new JTextField();
		final JTextField name1_field = new JTextField();
		final JTextField programme1_field=new  JTextField();
		final JTextField level1_field=new  JTextField();
		JButton return1_btn = new JButton("返回");
		JButton sure1_btn = new JButton("确定");
		JButton exit2_btn = new JButton("退出系统");
		// 设置各个标签和输入框的大小和位置
		Menu1_label.setBounds(250, 75, 100, 100);
		Id1_label.setBounds(200, 150, 100, 50);
		name1_label.setBounds(200, 190, 100, 50);
		programme1_label.setBounds(200,270,100,50);
		level1_label.setBounds(200,230,100,50);
		ID1_field.setBounds(300, 160, 80, 25);
		name1_field.setBounds(300, 200, 80, 25);
		programme1_field.setBounds(300,240,80,25);
		level1_field.setBounds(300,280,80,25);
		return1_btn.setBounds(120, 500, 100, 50);
		sure1_btn.setBounds(250, 500, 100, 50);
		exit2_btn.setBounds(380, 500, 100, 50);
		// 添加到面板
		write_page.add(Menu1_label);
		write_page.add(Id1_label);
		write_page.add(name1_label);
	    write_page.add(programme1_label);
		write_page.add(level1_label);
		write_page.add(ID1_field);
		write_page.add(name1_field);
		write_page.add(programme1_field);
		write_page.add(level1_field);
		write_page.add(return1_btn);
		write_page.add(sure1_btn);
		write_page.add(exit2_btn);
		return1_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				write_page.setVisible(false);
			}
		});
		sure1_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					new Insert().insert(ID1_field.getText(),name1_field.getText(),programme1_field.getText(),level1_field.getText());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		exit2_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
	}
}
