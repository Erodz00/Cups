public class glass extends cup {
	
	public glass(String glassName, String glassColor, int glassSerialNumber, boolean glassHandle, double glassMaxFluid, double glassCurrentFluid) {
		super(glassName, glassColor, glassSerialNumber, glassHandle, glassMaxFluid, glassCurrentFluid);
	}
	
	public boolean dropCup() {
		if(Math.random() * 100 > 80) this.broken = false;
		else {
			this.broken = true;
			this.maxFluid = 0;
			this.currentFluid = 0;
		}
		return this.broken;
	}
	
}