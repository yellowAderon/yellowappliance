package by.tc.task01.dao.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	
	private final ApplianceSearch applianceSearcher = new ApplianceSearch();
	
	
	public List<Appliance> find(Criteria criteria) {
	
		return applianceSearcher.find(criteria);
	}

	@Override
	public boolean add(Appliance newAppliance) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}


