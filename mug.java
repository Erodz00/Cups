public class mug extends cup {

	private String mugName;
	private String mugColor;
	private String mugSerialNumber;
	private boolean mugHandle;
	private double mugMaxFluid;
	private double mugCurrentFluid;

	public mug(String mugName, String mugColor, int mugSerialNumber, boolean mugHandle, double mugMaxFluid, double mugCurrentFluid) {
		super(mugName, mugColor, mugSerialNumber, mugHandle, mugMaxFluid, mugCurrentFluid);
	}

	public String getName() {
		return this.mugName;
	}
	public void setName(String newMugName) {
		this.mugName=newMugName;
	}

	public String getColor() {
		return this.mugColor;
	}
	
	public void setColor(String newMugColor) {
		this.mugColor=newMugColor;
	}

	public String getSerialNumber() {
		return this.mugSerialNumber;
	}
	
	public void setSerialNumber(String newMugSerialNumber) {
		this.mugSerialNumber=newMugSerialNumber;
	}

	public boolean getHandle() {
		return this.mugHandle;
	}
	
	public void setHandle(boolean newMugHandle) {
		this.mugHandle=newMugHandle;
	}

	public double getMaxFluid() {
		return this.mugMaxFluid;
	}
	
	public void setMaxFluid(double newMugMaxFluid) {
		this.mugMaxFluid=newMugMaxFluid;
	}

	public double getCurrentFluid() {
		return this.mugCurrentFluid;
	}
	public void setCurrentFluid(double newMugCurrentFluid) {
		this.mugCurrentFluid=newMugCurrentFluid;
	}
}