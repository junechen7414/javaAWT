package bobbyawttest;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class hibob {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static double num1=0,num2=0;
	public static int sign;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hibob window = new hibob();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hibob() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("DSG Calculator");
		frame.setBounds(100, 100, 741, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.pink);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(0, 116, 377, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 201, 377, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_7 = new JButton("1");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"1");
				else
					lblNewLabel.setText("1");
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"2");
				else
					lblNewLabel.setText("2");
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"3");
				else
					lblNewLabel.setText("3");
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"4");
				else
					lblNewLabel.setText("4");
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"5");
				else
					lblNewLabel.setText("5");
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_2 = new JButton("6");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"6");
				else
					lblNewLabel.setText("6");
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"7");
				else
					lblNewLabel.setText("7");
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"8");
				else
					lblNewLabel.setText("8");
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"9");
				else
					lblNewLabel.setText("9");
			}
		});
		panel.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("DSG Calculator");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(413, 116, 156, 65);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_11 = new JButton("Clear");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("0");
			}
		});
		btnNewButton_11.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_11.setForeground(Color.BLUE);
		btnNewButton_11.setBounds(482, 201, 87, 103);
		frame.getContentPane().add(btnNewButton_11);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(423, 201, 49, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		//double num1;
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lblNewLabel.getText()); 
				lblNewLabel.setText("0");
				sign=1;
			}
		});
		btnNewButton_13.setForeground(Color.RED);
		btnNewButton_13.setFont(new Font("新細明體", Font.BOLD, 12));
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lblNewLabel.getText()); 
				lblNewLabel.setText("0");
				sign=2;
			}
		});
		btnNewButton_14.setForeground(Color.RED);
		btnNewButton_14.setFont(new Font("新細明體", Font.BOLD, 12));
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_10 = new JButton("x");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lblNewLabel.getText()); 
				lblNewLabel.setText("0");
				sign=3;
			}
		});
		btnNewButton_10.setForeground(Color.RED);
		btnNewButton_10.setFont(new Font("新細明體", Font.BOLD, 12));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("/");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(lblNewLabel.getText()); 
				lblNewLabel.setText("0");
				sign=4;
			}
		});
		btnNewButton_9.setForeground(Color.RED);
		btnNewButton_9.setFont(new Font("新細明體", Font.BOLD, 12));
		panel_1.add(btnNewButton_9);
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(lblNewLabel.getText());				
				switch(sign) {
				case 1:
					lblNewLabel.setText(Double.toString(num1+num2));
					break;
				case 2:
					lblNewLabel.setText(Double.toString(num1-num2));
					break;
				case 3:
					lblNewLabel.setText(Double.toString(num1*num2));
					break;
				case 4:
					lblNewLabel.setText(Double.toString(num1/num2));
					break;
				}
				
			}
		});
		btnNewButton_12.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_12.setForeground(Color.BLUE);
		btnNewButton_12.setBounds(482, 314, 87, 103);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.setBounds(0, 373, 251, 44);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton(".");
		btnNewButton_16.setBounds(253, 373, 124, 44);
		frame.getContentPane().add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+".");
				else
					lblNewLabel.setText("0.");
			}
		});
		btnNewButton_16.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText()!="0")
					lblNewLabel.setText(lblNewLabel.getText()+"0");					
			}
		});
	}
	static class WinLis extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			frame.dispose();
		}
	}
}
