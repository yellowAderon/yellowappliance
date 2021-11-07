package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceSearch {

	private final ApplianceData repository;

	public ApplianceSearch() {
		this.repository = ApplianceData.getInstance();
	}

	public List<Appliance> find(Criteria criteria) {
		if (criteria == null) {
			return repository.getData();
		}

		List<String> searchData = toStringForm(criteria.getCriteria());

		return filterAppliances(searchData);
	}

	private List<Appliance> filterAppliances(List<String> searchCriteria) {
		return repository.getData().stream()
				.filter(appliance -> searchCriteria.stream().allMatch(param -> appliance.toString().contains(param)))
				.toList();
	}

	private List<String> toStringForm(Map<String, String> criteriaParams) {
		List<String> searchData = new ArrayList<>();

		criteriaParams.keySet().forEach(key -> {
			if (key.equals("type")) {
				searchData.add(criteriaParams.get(key));
			} else {
				searchData.add(key + "=" + criteriaParams.get(key));
			}
		});

		return searchData;
	}

}
