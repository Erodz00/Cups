public class cup {
	String name, color;
	int serialNumber;
	boolean handle, broken;
	double maxFluid, currentFluid;

	public cup(String cupName, String cupColor, int cupSerialNumber, boolean cupHandle, double cupMaxFluid, double cupCurrentFluid) {
		name = cupName;
		color = cupColor;
		serialNumber = cupSerialNumber;
		handle = cupHandle;
		broken = false;
		maxFluid = cupMaxFluid;
		currentFluid = cupCurrentFluid;
	}

	public double fillCup(double amount) {
		if (amount > this.maxFluid || this.currentFluid + amount > this.maxFluid)
			this.currentFluid = this.maxFluid;
		else
			this.maxFluid += amount;
		return currentFluid;
	}

	public double emptyCup(double amount) {
		this.currentFluid -= amount;
		if (this.currentFluid <= 0) {
			this.currentFluid = 0;
		}
		return currentFluid;
	}

	public boolean dropCup() {
		if(Math.random() * 100 > 20) this.broken = false;
		else {
			this.broken = true;
			this.maxFluid = 0;
			this.currentFluid = 0;
		}
		return this.broken;
	}

	public boolean breakCup() {
		this.broken = true;
		this.currentFluid = 0;
		this.maxFluid = 0;
		return this.broken;
	}
}