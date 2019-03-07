# TPOPEnvelopePractical

DEV Branch for editing only 
Confirm works before pushing to master branch

Heirarchy plan

Class Envelope
	
	Attributes:
		-ArrayList Bars
       	-ArrayList Points
		
	Methods:
		- Envelope()
		- Envelope(ArrayList<Bar>)

		+getEnvelope()
		+AddBar()
		-calcEnvelope()
		-isPointBetween()



Class Bar
	
	Attributes:
		- lX, rX, h
	Methods:
		+Bar(int lx, int rX, int h)
		+getValues()
		(return [rX, lX, H]);
		+setValues(rX, lX, H)
		+setRX(rX)
		+setLX(lX)
		+setH(H)


Class Point
	
	Attributes:
		-x
		-h
	Methods:	
		+Point(int x, int h)
		+getX()
		+getH()
		+setX()
		+setH()

MainApps
	
	ArrayList<Bar> = Bars
	Envelope e = new Envelope(bars)





