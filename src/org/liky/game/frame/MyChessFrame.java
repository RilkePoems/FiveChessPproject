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

public class MyChessFrame extends JFrame implements MouseListener {//����������������
	public MyChessFrame(){	
		this.setTitle("�������塷");		//������Ϸ�������
		this.setSize(500,520);			//������Ϸ�����С
		this.setResizable(false);		//���ô�������Ƿ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//���ô��壺�����������Ҳ������
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;		//ͨ��Toolkit.getDefaultToolkit���ȡ������Ļ�Ŀ��
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;	//ͨ��Toolkit.getDefaultToolkit���ȡ������Ļ�ĸ߶�
		this.setLocation((width - 500)/2,(height-500)/2);		//������Ϸ����ĳ�ʼλ��
		
		this.addMouseListener(this);
		
		
		this.setVisible(true);			//���ô����Ƿ���ʾ
	}
	
	public void paint(Graphics g){
		
		//ִ��io������ʱ����Ҫ����try catch
		BufferedImage image = null;
		try {
			//ͨ������һ��file�������õ�һ��ͼƬ�������ظ�bufferedImage
			image = ImageIO.read(new File("D:/JavaTest/background.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//image��λ���Ǳ�ʾ���Ǹ�ͼƬ���ƽ�����thisλ�ñ�ʾ���Ƶ��ĸ��ط�
		g.drawImage(image, 0,20, this);
		
		//g.drawLine(0, 50, 500, 50);//����ֱ�ߣ�x1��y1ȷ����㣬x2��y2ȷ���յ�
		//g.drawRect(20, 40, 40, 20);//���ƿ��Ծ���
		//g.fillRect(80, 40, 40, 20);//����ʵ�ľ���
		//g.drawString("��������Ϸ", 200, 40);//�����ַ���
		//g.drawOval(20, 40, 40, 40);//���ƿ���Բ��
		g.fillOval(55,70, 40, 40);//����ʵ��Բ��
		
		g.setColor(Color.BLUE);//�����·����ƺþ��ε���ɫ
		g.fillRect(80, 40, 40, 40);
		
		g.setFont(new Font("����",100,100));//���û���������塢��С
		g.drawString("��������Ϸ", 100,100);
		


		

	}
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {//����������¼��Ĳ���
	}
	@Override
	public void mouseEntered(MouseEvent e) {//�����������¼��Ĳ���
	}
	@Override
	public void mouseExited(MouseEvent e) {//��������뿪���¼�
	}
	@Override
	public void mousePressed(MouseEvent e) {//�������İ��µ��¼�����
//		System.out.println("���λ�ã�X��" + e.getX());
//		System.out.println("���λ�ã�Y��" + e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {//��������̧���¼�
		
		
	}
}
