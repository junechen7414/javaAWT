package ½m²ß1;


public class Mage  extends Role implements LifeRecoverable,MagicRecoverable{
	public Mage(String Name,int Life,int Magic) {
		super(Name,Life,Magic);
	}
	public void SmallFire(Role R) {
		
		if(getMagic()<25) {
			System.out.printf("§ðÀ»µL®Ä\n"+R+"\n");
		}
		else {
			setMagic(getMagic()-25);
			if(R instanceof Mage) {
			R.setLife(R.getLife()-60);}
			else {
				R.setLife(R.getLife()-40);
			}
			System.out.printf(R.getName()+"³Q§ðÀ»\n"+R+"\n");
			
			if(R.getLife()<=0) {
				System.out.printf(R.getName()+"³QÀ»±þ\n");
				System.exit(0);
			}
		}		
		
	}
	@Override
	public double recoverLife() {
		return getLife()+LIFERATE;
	}
	@Override
	public double recoverMagic() {
		return getMagic()+MAGICRATE;
	}
	
	@Override
	public String toString() {
		return (getName()+" Life: "+getLife()+" Magic: "+getMagic());
	}
	
	
}

