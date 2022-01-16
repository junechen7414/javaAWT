import java.awt.*;
import java.awt.event.*;

public class awt1 extends Frame implements ActionListener,MouseMotionListener{
	static awt1 frm=new awt1();
	static MenuBar mb=new MenuBar();
	static Menu menu1=new Menu("繪圖");
	static Menu menu2=new Menu("其他操作");
	static MenuItem mi1=new MenuItem("直線");
	static MenuItem mi2=new MenuItem("橢圓");
	static MenuItem mi3=new MenuItem("矩形");
	static MenuItem mi4=new MenuItem("移動");	
	static MenuItem mi5=new MenuItem("關閉");	
	static int x1,y1,x2,y2,drawmode,boundx1,boundx2,boundy1,boundy2,linetype;
	static boolean Drawline,DrawRec,DrawOval;
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		mb.add(menu1);mb.add(menu2);
		menu1.add(mi1);menu1.add(mi2);menu1.add(mi3);
		menu2.add(mi4); menu2.add(mi5);
		
		mi1.addActionListener(frm);
		mi2.addActionListener(frm);
		mi3.addActionListener(frm);
		mi4.addActionListener(frm);
		mi5.addActionListener(frm);
		frm.addMouseListener(new MouseAdp());
		frm.addMouseMotionListener(frm);
		frm.setTitle("繪圖小程式");
		frm.setMenuBar(mb);
		frm.setSize(500, 500);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		MenuItem mi=(MenuItem)e.getSource();
		
		if(mi==mi1) {
			drawmode=1;
		}
		else if(mi==mi2) {
			drawmode=2;
		}
		else if(mi==mi3) {
			drawmode=3;
		}
		else if(mi==mi4) {
			drawmode=4;
		}
		else if(mi==mi5) {
			frm.dispose();
		}
	}	
	static class MouseAdp extends MouseAdapter {
		public void mousePressed(MouseEvent e) {	
				x1=e.getX();
				y1=e.getY();
							
		}		
	}
		public void mouseDragged(MouseEvent e) {
			Graphics g=getGraphics();
			x2=e.getX();y2=e.getY();	
			update(g);	
		
	}
	public void mouseMoved(MouseEvent e) {}
	
	public void paint(Graphics g) {
		if(drawmode==1) {
			g.setColor(Color.black);
			g.drawLine(x1, y1, x2, y2);			
			if(x2>x1&&y2>y1) {				
				boundx1=x1;boundx2=x2;boundy1=y1;boundy2=y2;
				linetype=1;
				}
			else if(x2<x1&&y2>y1) {					
				boundx1=x2;boundx2=x1;boundy1=y1;boundy2=y2;
				linetype=2;
			}
			else if(x2>x1&&y2<y1) {					
				boundx1=x1;boundx2=x2;boundy1=y2;boundy2=y1;
				linetype=2;
			}
			else if(x2<x1&&y2<y1) {				
				boundx1=x2;boundx2=x1;boundy1=y2;boundy2=y1;
				linetype=1;
			} 
			Drawline=true;DrawOval=false;DrawRec=false;
		}
		else if(drawmode==2) {
			g.setColor(Color.red);
			if(x2>x1&&y2>y1) {
				g.fillOval(x1, y1, (x2-x1), (y2-y1));	
				boundx1=x1;boundx2=x2;boundy1=y1;boundy2=y2;
				}
			else if(x2<x1&&y2>y1) {
				g.fillOval(x2, y1, (x1-x2), (y2-y1));
				boundx1=x2;boundx2=x1;boundy1=y1;boundy2=y2;
			}
			else if(x2>x1&&y2<y1) {
				g.fillOval(x1, y2, (x2-x1), (y1-y2));
				boundx1=x1;boundx2=x2;boundy1=y2;boundy2=y1;
			}
			else if(x2<x1&&y2<y1) {
				g.fillOval(x2, y2, (x1-x2), (y1-y2));
				boundx1=x2;boundx2=x1;boundy1=y2;boundy2=y1;
			}
			DrawOval=true;Drawline=false;DrawRec=false;
		}
		else if(drawmode==3){
			g.setColor(Color.yellow);
			if(x2>x1&&y2>y1) {
				g.fillRect(x1, y1, (x2-x1), (y2-y1));
				boundx1=x1;boundx2=x2;boundy1=y1;boundy2=y2;
				}
			else if(x2<x1&&y2>y1) {
				g.fillRect(x2, y1, (x1-x2), (y2-y1));
				boundx1=x2;boundx2=x1;boundy1=y1;boundy2=y2;
			}
			else if(x2>x1&&y2<y1) {
				g.fillRect(x1, y2, (x2-x1), (y1-y2));
				boundx1=x1;boundx2=x2;boundy1=y2;boundy2=y1;
			}
			else if(x2<x1&&y2<y1) {
				g.fillRect(x2, y2, (x1-x2), (y1-y2));
				boundx1=x2;boundx2=x1;boundy1=y2;boundy2=y1;
			}
			DrawRec=true;DrawOval=false;Drawline=false;			
		}
		else if(drawmode==4) {
			if(x1>boundx1&&x1<boundx2&&y1>boundy1&&y1<boundy2) {				
				if(Drawline) {
					if(linetype==1) {
						g.drawLine(x2-x1+boundx1, y2-y1+boundy1,x2-x1+boundx2, y2-y1+boundy2 );
					}
					else if(linetype==2) {
						g.drawLine(x2-x1+boundx1, y2-y1+boundy2,x2-x1+boundx2, y2-y1+boundy1 );
					}					
				}
				if(DrawOval) {
					g.setColor(Color.red);
					g.fillOval(x2-x1+boundx1, y2-y1+boundy1, boundx2-boundx1, boundy2-boundy1);
				}
				if(DrawRec) {
					g.setColor(Color.yellow);
					g.fillRect(x2-x1+boundx1, y2-y1+boundy1, boundx2-boundx1, boundy2-boundy1);
				}
			}
		}
		
	}
	
}
