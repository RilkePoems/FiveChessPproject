package org.liky.game.frame;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.tools.Tool;
/**
 * 正式版五子棋开发
 * 功能：窗体控制类
 * @author 龙双权
 *
 *
 */
public class FiveChessFrame extends JFrame implements MouseListener {
	//获得本地电脑屏幕的宽度
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	//获得本地电脑屏幕的高度
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	
	public FiveChessFrame() {
		//设置游戏窗体名称
		this.setTitle("五子棋");
		//设置游戏窗体的大小
		this.setSize(500, 500);
		//使得游戏的窗体在打开时候固定在屏幕的某处
		this.setLocation((width - 500)/2, (height - 500)/2);
		//将窗体设置成大小不可改变
		this.setResizable(false);
		//将窗体的关闭方式设置为默认关闭后程序结束
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//将窗体显示出来
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
