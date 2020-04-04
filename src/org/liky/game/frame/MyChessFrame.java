package org.liky.game.frame;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyChessFrame extends JFrame implements MouseListener {//导入了鼠标监听的类
	public MyChessFrame(){	
		this.setTitle("《五子棋》");		//设置游戏窗体标题
		this.setSize(500,520);			//设置游戏窗体大小
		this.setResizable(false);		//设置窗体最大化是否可用
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//设置窗体：点击×，程序也结束。
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;		//通过Toolkit.getDefaultToolkit类获取到了屏幕的宽度
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;	//通过Toolkit.getDefaultToolkit类获取到了屏幕的高度
		this.setLocation((width - 500)/2,(height-500)/2);		//设置游戏窗体的初始位置
		
		this.addMouseListener(this);
		
		
		this.setVisible(true);			//设置窗体是否显示
	}
	
	public void paint(Graphics g){
		
		//执行io操作的时候需要坐下try catch
		BufferedImage image = null;
		try {
			//通过传入一个file对象，来得到一个图片，并返回给bufferedImage
			image = ImageIO.read(new File("D:/JavaTest/background.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//image的位置是表示将那个图片绘制进来，this位置表示绘制到哪个地方
		g.drawImage(image, 0,20, this);
		
		//g.drawLine(0, 50, 500, 50);//绘制直线，x1与y1确定起点，x2与y2确定终点
		//g.drawRect(20, 40, 40, 20);//绘制空性矩形
		//g.fillRect(80, 40, 40, 20);//绘制实心矩形
		//g.drawString("五子棋游戏", 200, 40);//绘制字符串
		//g.drawOval(20, 40, 40, 40);//绘制空心圆形
		g.fillOval(55,70, 40, 40);//绘制实心圆形
		
		g.setColor(Color.BLUE);//设置下方绘制好矩形的颜色
		g.fillRect(80, 40, 40, 40);
		
		g.setFont(new Font("宋体",100,100));//设置画布里的字体、大小
		g.drawString("五子棋游戏", 100,100);
		


		

	}
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {//监听鼠标点击事件的操作
	}
	@Override
	public void mouseEntered(MouseEvent e) {//监听鼠标进入事件的操作
	}
	@Override
	public void mouseExited(MouseEvent e) {//监听鼠标离开的事件
	}
	@Override
	public void mousePressed(MouseEvent e) {//监听鼠标的按下的事件操作
//		System.out.println("点击位置：X轴" + e.getX());
//		System.out.println("点击位置：Y轴" + e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {//监听鼠标的抬起事件
		
		
	}
}
