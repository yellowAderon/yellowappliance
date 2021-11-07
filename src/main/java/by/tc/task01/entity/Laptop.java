package by.tc.task01.entity;

public class Laptop extends Appliance{
	
	private String os;
	private int memoryRom, systemMemory, cpu, display;
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cpu;
		result = prime * result + display;
		result = prime * result + memoryRom;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (cpu != other.cpu)
			return false;
		if (display != other.display)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [os=" + os + ", memoryRom=" + memoryRom + ", systemMemory=" + systemMemory + ", cpu=" + cpu
				+ ", display=" + display + "]";
	}
	public Laptop(String os, int memoryRom, int systemMemory, int cpu, int display) {
		super();
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.display = display;
	}
	public Laptop(int power, int weight, int freezerCapacity, int overallCapacity, int height, int width) {
		// TODO Auto-generated constructor stub
	}
	
	
}
