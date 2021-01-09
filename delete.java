package com.jishou.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jishou.pojo.Delete;
import com.jishou.pojo.Insert;
import com.jishou.ui.GUI;
public class delete {
	public static void delete() throws SQLException {
				JFrame delate_page = new JFrame("张家界水资源污染治理信息管理系统");
				/**
				* 设置窗口的大小
				*/
				delate_page.setSize(600, 600); 
				/**
				* 设置程序默认布局格式为空，以便于后期自己简单的设置布局
				*/
				delate_page.setLayout(null);
				/**
				 *  设置不可缩放
				 */
				delate_page.setResizable(false); 
				/**
				 *  给主页设置位置
				 */
				delate_page.setLocation(400, 200);
				/**
				 *  给主页设置大小
				 */
				delate_page.setSize(600, 600);
				/**
				 *  设置主页能够关闭，并且登录成功后将登录页面隐藏
				 */
				delate_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				delate_page.setVisible(true);
				/**
				 *  声明
				 */
				JLabel Menu2_label = new JLabel("删除水资源信息");
				JLabel Id2_label = new JLabel("请输入ID");
				final JTextField ID2_field = new JTextField();
				JButton return2_btn = new JButton("返回");
				JButton sure2_btn = new JButton("确定");
				JButton exit3_btn = new JButton("退出系统");
				/**
				 *  设置各个标签和输入框的大小和位置
				 */
				Menu2_label.setBounds(250, 75, 100, 100);
				Id2_label.setBounds(180, 200, 200, 50);
				ID2_field.setBounds(300, 210, 80, 25);
				return2_btn.setBounds(120, 400, 100, 50);
				sure2_btn.setBounds(250, 400, 100, 50);
				exit3_btn.setBounds(380, 400, 100, 50);
				/**
				 *  添加到面板
				 */
				delate_page.add(Menu2_label);
				delate_page.add(Id2_label);
				delate_page.add(ID2_field);
				delate_page.add(return2_btn);
				delate_page.add(sure2_btn);
				delate_page.add(exit3_btn);
				return2_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						delate_page.setVisible(false);
					}
				});
				sure2_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							new Delete().delete(ID2_field.getText());
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				exit3_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						System.exit(0);
					}
				});
			}
}
