package envelopeClasses;

import java.util.ArrayList;

public class Envelope {
	
	private ArrayList<Bar> barsList = new ArrayList<Bar>();
//	private ArrayList<Point> points = new ArrayList<Point>();
	
	public Envelope(ArrayList<Bar> userBars) 
	{
			this.barsList = userBars;
		
	}

	public String toString()
	{
		String output = "";
		for(Bar bar: barsList)
		{
			output = (output + bar.toString() + "\n");
		}
		return output;
	}
	

}
