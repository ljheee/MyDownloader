package com.ljheee.downloader.ui;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.ljheee.downloader.core.DownloadFile;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class DownloadFrame {

	private JFrame jf = null;
	private JTextField targetURL;
	private JTextField saveURL;
	boolean isFinish = true;
	public DownloadFrame() {
		this.jf = new JFrame("Download  1.0");;
//		jf.setSize(400, 300);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUrlurl = new JLabel("URL   \u5F85\u4E0B\u8F7D\u6587\u4EF6url\u5730\u5740");
		
		targetURL = new JTextField();
		targetURL.setColumns(35);
		
		JLabel lbldtodoabcpng = new JLabel("\u6587\u4EF6\u4FDD\u5B58\u8DEF\u5F84\u53CA\u547D\u540D   \u5982D:\\\\todo\\abc.png");
		
		saveURL = new JTextField();
		saveURL.setColumns(35);
		
		//开始下载
		JButton button = new JButton("\u5F00\u59CB\u4E0B\u8F7D");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String urlStr = targetURL.getText();
				URL url = null;
				try {
					url = new URL(urlStr);
					String dest = saveURL.getText();
					DownloadFile.downloadFile(url,dest);
				} catch (IOException e) {
					e.printStackTrace();
					isFinish = false;
					JOptionPane.showMessageDialog(jf, "Error: "+e.getMessage());
				}
				if(isFinish) JOptionPane.showMessageDialog(jf, "下载完成！");
			
			}

			
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(jf.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUrlurl)
						.addComponent(targetURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbldtodoabcpng)
						.addComponent(saveURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblUrlurl)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(targetURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lbldtodoabcpng)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(saveURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(button)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		jf.getContentPane().setLayout(groupLayout);
		
		
		
		
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DownloadFrame();
	}
}
