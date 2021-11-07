package by.tc.task01.entity;

public class Refrigerator extends Appliance {

	private int power, weight, freezerCapacity, overallCapacity, height, width;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		result = prime * result + overallCapacity;
		result = prime * result + power;
		result = prime * result + weight;
		result = prime * result + width;
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (overallCapacity != other.overallCapacity)
			return false;
		if (power != other.power)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [power=" + power + ", weight=" + weight + ", freezerCapacity=" + freezerCapacity
				+ ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width + "]";
	}

	public Refrigerator(int power, int weight, int freezerCapacity, int overallCapacity, int height, int width) {
		super();
		this.power = power;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

}
