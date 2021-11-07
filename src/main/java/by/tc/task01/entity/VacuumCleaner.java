package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {

	private int power, motorSpeed, wandType;
	private String filterType, bagType;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMotorSpeed() {
		return motorSpeed;
	}

	public void setMotorSpeed(int motorSpeed) {
		this.motorSpeed = motorSpeed;
	}

	public int getWandType() {
		return wandType;
	}

	public void setWandType(int wandType) {
		this.wandType = wandType;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeed;
		result = prime * result + power;
		result = prime * result + wandType;
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeed != other.motorSpeed)
			return false;
		if (power != other.power)
			return false;
		if (wandType != other.wandType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [power=" + power + ", motorSpeed=" + motorSpeed + ", wandType=" + wandType
				+ ", filterType=" + filterType + ", bagType=" + bagType + "]";
	}

	public VacuumCleaner(int power, int motorSpeed, int wandType, String filterType, String bagType) {
		super();
		this.power = power;
		this.motorSpeed = motorSpeed;
		this.wandType = wandType;
		this.filterType = filterType;
		this.bagType = bagType;
	}

}
