package envelopeClasses;

public class Point {
	int x;
	int h;
	
	Point(int x, int h){
		this.x = x;
		this.h = h;
	}
	
	public int getX() {
		return x;
	}
	
	public int getH() {
		return h;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setH(int h) {
		this.h= h;
	}
	
	public String toString() {
		String s = "X = " + x + ", h = " + h;
		return s;
		}

}
