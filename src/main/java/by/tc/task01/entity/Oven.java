package by.tc.task01.entity;

public class Oven extends Appliance {

	private int power, capacity, weight, depth, height, width;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
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
		result = prime * result + capacity;
		result = prime * result + depth;
		result = prime * result + height;
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (depth != other.depth)
			return false;
		if (height != other.height)
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
		return "Oven [power=" + power + ", capacity=" + capacity + ", weight=" + weight + ", depth=" + depth
				+ ", height=" + height + ", width=" + width + "]";
	}

	public Oven(int power, int capacity, int weight, int depth, int height, int width) {
		super();
		this.power = power;
		this.capacity = capacity;
		this.weight = weight;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

}
