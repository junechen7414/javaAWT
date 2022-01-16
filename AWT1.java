import java.awt.*;
import java.awt.event.*;
public class AWT1 extends Frame{
		static AWT1 frm=new AWT1();static WinLis winclose=new WinLis();
		static Button but0=new Button("0");	static Button but1=new Button("1");	static Button but2=new Button("2");
		static Button but3=new Button("3");	static Button but4=new Button("4");	static Button but5=new Button("5");
		static Button but6=new Button("6");	static Button but7=new Button("7");	static Button but8=new Button("8");
		static Button but9=new Button("9");	static Button butdot=new Button(".");	static Button butplus=new Button("+");
		static Button butminus=new Button("-");static Button buttimes=new Button("x");static Button butdiv=new Button("/");
		static Button butequals=new Button("="); static Button butclear=new Button("Clear"); static Panel pnl=new Panel(new GridLayout(3,3));
		static Label lbl=new Label("0",Label.RIGHT); static Label lbl1=new Label("DSG Calculator");
		static double num[];static String oper[];static int numOfnum=0;static int numOfoperator=0;static double result=0;
		static double num1=0,num2=0;static int sign;																			//so many define
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frm.setTitle("DSG Calculator");
		frm.setLayout(null);
		frm.setSize(300,200);
		lbl.setBackground(Color.pink);
		lbl.setBounds(20, 30, 165, 25);
		pnl.setBounds(20, 60, 120, 80);
		but0.setBounds(20, 140, 80, 20);
		but0.addActionListener(new ActLis());but1.addActionListener(new ActLis());but2.addActionListener(new ActLis());			//so many action listener
		but3.addActionListener(new ActLis());but4.addActionListener(new ActLis());but5.addActionListener(new ActLis());
		but6.addActionListener(new ActLis());but7.addActionListener(new ActLis());but8.addActionListener(new ActLis());
		but9.addActionListener(new ActLis());butdot.addActionListener(new ActLis());butplus.addActionListener(new ActLis());
		butminus.addActionListener(new ActLis());buttimes.addActionListener(new ActLis());butdiv.addActionListener(new ActLis());
		butequals.addActionListener(new Equal());butclear.addActionListener(new Clear());
		pnl.add(but1);pnl.add(but2);pnl.add(but3);pnl.add(but4);pnl.add(but5);pnl.add(but6);pnl.add(but7);pnl.add(but8);
		pnl.add(but9);
		/*
		  	for(int i=1;i<10;i++) {				
			pnl.add(new Button(Integer.toString(i)));			
		}
		*/
		
		frm.addWindowListener(winclose);		
				
		frm.add(lbl);
		frm.add(pnl);
		frm.add(but0);											//set window set bound this and that 
				
		butdot.setBounds(100, 140, 40, 20);
		frm.add(butdot);
		
		pnl=new Panel(new GridLayout(4,1));
		pnl.setBounds(150, 60, 35, 100);		
		butplus.setForeground(Color.blue);
		butplus.setFont(new Font("",Font.BOLD,15));
		pnl.add(butplus);
		
		butminus.setForeground(Color.blue);
		butminus.setFont(new Font("",Font.BOLD,15));
		pnl.add(butminus);
		
		buttimes.setForeground(Color.blue);
		buttimes.setFont(new Font("",Font.BOLD,15));
		pnl.add(buttimes);
		
		butdiv.setForeground(Color.blue);
		butdiv.setFont(new Font("",Font.BOLD,15));
		pnl.add(butdiv);
				
		frm.add(pnl);
		
		
		lbl1.setFont(new Font("",Font.BOLD+Font.ITALIC,8));
		lbl1.setBounds(195, 30, 100, 25);
		frm.add(lbl1);
		
		butequals.setBounds(195, 60, 50, 45);
		butequals.setForeground(Color.red);
		butequals.setFont(new Font("",Font.BOLD,15));
		frm.add(butequals);
		
		
		butclear.setBounds(195, 115, 50, 45);
		butclear.setForeground(Color.red);
		butclear.setFont(new Font("",Font.BOLD,15));
		frm.add(butclear);
		frm.setVisible(true);
	}
	static class WinLis extends WindowAdapter{									//close window
		public void windowClosing(WindowEvent e) {
			frm.dispose();
		}
	}
	static class ActLis implements ActionListener{								//1~9 and +-*/
		public void actionPerformed(ActionEvent e) {			
				if(((Button)e.getSource()).getLabel()=="+") {
					sign=1;
					num1=Double.parseDouble(lbl.getText());
					lbl.setText(((Button)e.getSource()).getLabel());
				}
				else if(((Button)e.getSource()).getLabel()=="-") {
					sign=2;
					num1=Double.parseDouble(lbl.getText());
					lbl.setText(((Button)e.getSource()).getLabel());
				}
				else if(((Button)e.getSource()).getLabel()=="x") {
					sign=3;
					num1=Double.parseDouble(lbl.getText()); 
					lbl.setText(((Button)e.getSource()).getLabel());
				}				
				else if(((Button)e.getSource()).getLabel()=="/") {
					sign=4;
					num1=Double.parseDouble(lbl.getText());
					lbl.setText(((Button)e.getSource()).getLabel());
				}				
				else if(lbl.getText()!="0"&&lbl.getText()!="+"&&lbl.getText()!="-"&&lbl.getText()!="x"&&lbl.getText()!="/"){
					lbl.setText(lbl.getText()+((Button)e.getSource()).getLabel());						
				}
				else
					lbl.setText(((Button)e.getSource()).getLabel());
					
				
		}
	}
		static class Equal implements ActionListener{				//=
		public void actionPerformed(ActionEvent e) {
			num2=Double.parseDouble(lbl.getText());
			switch(sign) {
			case 1:
				result=num1+num2;
				break;
			case 2:
				result=num1-num2;
				break;
			case 3:
				result=num1*num2;
				break;
			case 4:
				result=num1/num2;
				break;
			default:
				break;
			}
			lbl.setText(Double.toString(result));
		}
	}
		static class Clear implements ActionListener{			//clear label
			public void actionPerformed(ActionEvent e){
				lbl.setText("");
			}
		}
}
