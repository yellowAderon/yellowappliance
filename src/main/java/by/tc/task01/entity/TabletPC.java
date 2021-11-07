package by.tc.task01.entity;

public class TabletPC extends Appliance {

	private int batteryCapacity, displayInches, memoryRom, flashMemory;
	private String colour;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemory() {
		return flashMemory;
	}

	public void setFlashMemory(int flashMemory) {
		this.flashMemory = flashMemory;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemory;
		result = prime * result + memoryRom;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemory != other.flashMemory)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemory=" + flashMemory + ", colour=" + colour + "]";
	}

	public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemory, String colour) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemory = flashMemory;
		this.colour = colour;
	}

}
