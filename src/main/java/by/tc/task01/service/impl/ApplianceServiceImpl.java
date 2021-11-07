package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) {

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}

	public boolean add(Appliance appliance) {
		return false;
	}

}

//you may add your own new classes
