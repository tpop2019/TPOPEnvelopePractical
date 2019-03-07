package envelopeClasses;

import java.util.ArrayList;

public class MainApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Bar> testBars = new ArrayList<Bar>();
		testBars.add(new Bar(0,4,3));
		testBars.add(new Bar(3, 5, 8));
		
		Envelope e = new Envelope(testBars);
		System.out.println(e);
		
		System.out.println("THIS IS THE DEV BRANCH");
		
		System.out.println("HEY BEN");
		
	}

}
