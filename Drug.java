package ½m²ß1;

public class Drug {
	private String Size;
	private int Add;
	public Drug() {};
	public void setSize(String s) {
		Size=s;
	}
	
	public String getSize() {
		return Size;
	}
	public void setAdd(int i) {
		Add=i;
	}
	
	public int getAdd() {
		return Add;
	}
	
	public Drug(String s,int i ){
		Size=s;
		Add=i;
		
	}
	
}
