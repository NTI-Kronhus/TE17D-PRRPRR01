package enums;

public enum GasTable{

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92)
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		heatCapacity = hc;
		density = d * 1E3; // 1E3 = 1*10^3
	}

}
