package enums;

public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276)
	;

	double density;
	double heatCapacity;
	double smeltPoint;
	double smeltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		smeltEntalpy = se * 1E3;
	}

	
}
