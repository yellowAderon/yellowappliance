package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import by.tc.task01.entity.Appliance;

public class ApplianceData {
	
	private static final ApplianceData instance = new ApplianceData();

	private List<Appliance> data;
	
	private ApplianceData()  {
		ApplianceParser parser = new ApplianceParser();

		try {
			data = parser.parse();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// todo process exceptions
			e.printStackTrace();
		}
	}
	
	public List<Appliance> getData(){
		return data;
	}
	
	public static ApplianceData getInstance() {
		return instance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplianceData other = (ApplianceData) obj;
		return Objects.equals(data, other.data);
	}


}
