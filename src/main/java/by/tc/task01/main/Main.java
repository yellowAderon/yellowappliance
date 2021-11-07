package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService applianceService = factory.getApplianceService();
		List<Appliance> requiredAppliances;
		
		
		System.out.println("test result: find by criteria");
		System.out.println("=============================");
		Criteria searchCriteria = new Criteria("Oven"); 
		searchCriteria.getCriteria().put("weight", "11");
		searchCriteria.getCriteria().put("capacity", "35");
		requiredAppliances = applianceService.find(searchCriteria);
		requiredAppliances.forEach(System.out::println);
		
		System.out.println("=============================");
		System.out.println("test result v2: Show All");
		System.out.println("=============================");
		searchCriteria = new Criteria();
		requiredAppliances = applianceService.find(searchCriteria);
		requiredAppliances.forEach(System.out::println);
		

		

	}

}
		