package envelopeClasses;

public class Bar {

	private int lX;
	private int rX;
	private int h;
	
	public Bar(int rX, int lX, int h)
	{
		this.rX = rX;
		this.lX = lX;
		this.h = h;
	}
	
	public int [] getValue()
	{
		int [] values = {lX, rX, h};
		return values;
	}
	
	public void setValues(int rX, int lX, int h)
	{
		this.rX = rX;
		this.lX = lX;
		this.h = h;
	}
	
	public void setRX(int rX)
	{
		this.rX = rX;
	}
	
	public void setLX(int lX)
	{
		this.lX = lX;
	}
	
	public void setH(int h)
	{
		this.h = h;
	}
	
	public String toString()
	{
		String output = ("Poo: " + rX + ", Left: " + lX + ", Height: " + h);
		return output;
	}
}
