package com.greedy.ncs.vendingmachine;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VendingMachine {
	
	public static void main(String[] args) {
		
		JFrame mf = new JFrame("������ ���Ǳ�");
		
		mf.setSize(300, 500);
		
		JPanel title = new JPanel();
		JLabel titleLabel = new JLabel("������ ���Ǳ�");
		title.add(titleLabel);
		
		JPanel drink = new JPanel();
		String[][] menu = {{"���̴�","ȯŸ","�ݶ�","�ֽĽ�","��ī��","����","�������","�������꽺"}
							,{"1000","2000","3000","4000","5000","6000","7000","8000"}};
		
		
		drink.setLayout(new GridLayout(4,2));
		
		for(int i = 0; i < 9; i++) {
			String str = menu[i].toString();
			drink.add(new JButton(str));
		}
		
		JPanel result = new JPanel();
		JLabel resultLabel = new JLabel("���� ���ᰡ ���õ��� �ʾҽ��ϴ�.");
		result.add(resultLabel);

		mf.add(title, "North");
		mf.add(drink, "Center");
		mf.add(result, "South");
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
