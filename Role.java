package 練習1;

import java.security.SecureRandom;

public abstract class Role {
	private String Name;
	private	 int Life;
	private  int Magic;
	public Role() {}   //預設建構子
	public void setName(String N) {
		this.Name=N;
	}
	public void setLife(int L) {
		this.Life=L;
	}
	public void setMagic(int M) {
		this.Magic=M;
	}
	public String getName() {
		return this.Name;
	}
	public int getLife() {
		return this.Life;
	}
	public int getMagic() {
		return this.Magic;
	}
	public Role(String Name,int Life,int Magic) {
		this.Name=Name;
		this.Life=Life;
		this.Magic=Magic;
	}
	public void NewMoon(Role R) {
		//this and that		
	}
	public void SmallFire(Role R) {
		//blablabla
	}
	
	public void DrinkDrug(Drug D) {
		SecureRandom rand=new SecureRandom();
		int randint=rand.nextInt(10);
		if(D instanceof RedDrug) {
			if(randint==0){
				if(D instanceof RedDrug) {
				D.setAdd(120);
				setLife(getLife()+D.getAdd());
				System.out.printf("喝大紅藥水\n");
				}
				else {
					D.setAdd(100);
					setMagic(getMagic()+D.getAdd());
					System.out.printf("喝大藍藥水\n");
				}
				D.setSize("大");	
				
			}
			if(randint>0&&randint<3) {
				D.setAdd(80);
				D.setSize("中");
				setLife(getLife()+D.getAdd());
				System.out.printf("喝中紅藥水\n");
				}
			if(randint>2&&randint<7) {
				D.setAdd(50);
				D.setSize("小");
				setLife(getLife()+D.getAdd());
				System.out.printf("喝小紅藥水\n");
				}
			if(randint>6) {
				System.out.printf("喝不到紅藥水\n");
				return;
				}
		}
		else {
			if(randint==0){
				D.setAdd(100);
				D.setSize("大");
				
			
			}
			if(randint>0&&randint<3) {
				D.setAdd(60);
				D.setSize("中");
				setMagic(getMagic()+D.getAdd());
				System.out.printf("喝中藍藥水\n");
				}
			if(randint>2&&randint<7) {
				D.setAdd(30);
				setMagic(getMagic()+D.getAdd());
				D.setSize("小");
				System.out.printf("喝小藍藥水\n");
			}
			if(randint>6) {
				System.out.printf("喝不到藍藥水\n");
				return;
				}
		}
		
	}
	
}
