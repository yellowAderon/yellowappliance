package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, String> criteria = new HashMap<String, String>();
	
	
	public Criteria() {
		
	}

	public Criteria(String groupSearchName, Map<String, String> criteria) {
		super();
		this.groupSearchName = groupSearchName;
		this.criteria = criteria;
	}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public Map<String, String> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<String, String> criteria) {
		this.criteria = criteria;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, String value) {
		criteria.put(searchCriteria, value);
	}
	
	

}
