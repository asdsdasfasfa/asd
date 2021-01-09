package com.jishou.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jishou.dao.DataBaseConnection;
import com.jishou.dao.Wenben;
import com.jishou.pojo.Query;

public class GUI {
	private JFrame frame;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JButton btnOk;
	private JButton btnCancel;

	public void init() {
		frame = new JFrame("张家界水资源污染治理信息管理系统");
		lblUser = new JLabel("用户名:");
		lblPassword = new JLabel("密码:");
		txtUser = new JTextField(20);
		txtPassword = new JTextField(20);
		btnOk = new JButton("确定");
		btnCancel = new JButton("退出");
		frame.setSize(380, 230);
		frame.setLocation(780, 400);
		frame.setResizable(false);
		frame.setLayout(null);
		lblUser.setBounds(50, 20, 100, 20);
		frame.add(lblUser);
		txtUser.setBounds(130, 20, 100, 20);
		frame.add(txtUser);
		lblPassword.setBounds(50, 60, 100, 20);
		frame.add(lblPassword);
		txtPassword.setBounds(130, 60, 100, 20);
		frame.add(txtPassword);
		btnOk.setBounds(80, 110, 80, 20);
		frame.add(btnOk);
		btnCancel.setBounds(190, 110, 80, 20);
		frame.add(btnCancel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(txtUser.getText().equals("")&&txtPassword.getText().equals("")))
				JOptionPane.showMessageDialog(null, "账号密码错误", "Login", JOptionPane.INFORMATION_MESSAGE);
				else {
					JOptionPane.showMessageDialog(null, "登陆成功", "Login", JOptionPane.INFORMATION_MESSAGE);
				
				JFrame home_page = new JFrame("张家界水资源污染治理信息管理系统");
				home_page.setSize(600, 600); // 设置窗口的大小
				home_page.setLayout(null); // 设置程序默认布局格式为空，以便于后期自己简单的设置布局
				home_page.setResizable(false); // 设置不可缩放
				home_page.setLocation(400, 200);
				home_page.setSize(600, 600);
				home_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				home_page.setVisible(true);
				frame.setVisible(false);
				JLabel Menu_label = new JLabel("欢迎来到张家界水资源污染治理信息管理系统!!!");
				JButton write_btn = new JButton("1.添加水资源信息");
				JButton delate_btn = new JButton("2.删除水资源信息");
				JButton read_btn = new JButton("3.修改水资源信息");
				JButton display_btn = new JButton("4.查看水资源信息");
				JButton exit1_btn = new JButton("5.退出系统 ");
				Menu_label.setBounds(150, 15, 300, 200);
				write_btn.setBounds(200, 150, 150, 50);
				delate_btn.setBounds(200, 200, 150, 50);
				read_btn.setBounds(200, 250, 150, 50);
				display_btn.setBounds(200, 300, 150, 50);
				exit1_btn.setBounds(200, 350, 150, 50);
				home_page.add(Menu_label);
				home_page.add(write_btn);
				home_page.add(delate_btn);
				home_page.add(read_btn);
				home_page.add(display_btn);
				home_page.add(exit1_btn);
				exit1_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						System.exit(0);
					}
				});
				write_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							new insert().insert();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
		});
				delate_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							new delete().delete();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
		});
				read_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							new update().update();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
		});
				display_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							new query().query();
		
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
		});			
	  }
	}
	});
 }
	public static void main(String[] args) throws SQLException {
	GUI gui=new GUI();
	gui.init();
	}
}
