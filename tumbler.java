public class tumbler extends cup {
	
	public tumbler(String tumblerName, String tumblerColor, int tumblerSerialNumber, double tumblerMaxFluid, double tumblerCurrentFluid) {
		super(tumblerName, tumblerColor, tumblerSerialNumber, false, tumblerMaxFluid, tumblerCurrentFluid);
	}
	
	public double fillCup(double amount) {
		if (amount > this.maxFluid || this.currentFluid + amount > this.maxFluid)
			this.currentFluid = this.maxFluid;
		else
			this.maxFluid += amount;
		this.currentFluid -= this.currentFluid * .2;
		return currentFluid;
	}
	
}