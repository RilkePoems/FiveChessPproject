package org.liky.game.frame;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.tools.Tool;
/**
 * ��ʽ�������忪��
 * ���ܣ����������
 * @author ��˫Ȩ
 *
 *
 */
public class FiveChessFrame extends JFrame implements MouseListener {
	//��ñ��ص�����Ļ�Ŀ��
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	//��ñ��ص�����Ļ�ĸ߶�
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	
	public FiveChessFrame() {
		//������Ϸ��������
		this.setTitle("������");
		//������Ϸ����Ĵ�С
		this.setSize(500, 500);
		//ʹ����Ϸ�Ĵ����ڴ�ʱ��̶�����Ļ��ĳ��
		this.setLocation((width - 500)/2, (height - 500)/2);
		//���������óɴ�С���ɸı�
		this.setResizable(false);
		//������Ĺرշ�ʽ����ΪĬ�Ϲرպ�������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��������ʾ����
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
