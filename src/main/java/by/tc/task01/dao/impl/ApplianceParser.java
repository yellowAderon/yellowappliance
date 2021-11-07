package by.tc.task01.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceParser {

	private static final String FILE_PATH = "resources/db.xml";

	private List<Appliance> xmlApplianceData;

	public List<Appliance> parse() throws SAXException, IOException, ParserConfigurationException {
		SAXParserFactory factory;
		SAXParser parser;
		XMLHandler handler;

		xmlApplianceData = new ArrayList<>();
		factory = SAXParserFactory.newInstance();
		parser = factory.newSAXParser();
		handler = new XMLHandler();

		parser.parse(new File(FILE_PATH), handler);

		return xmlApplianceData;
	}

	private class XMLHandler extends DefaultHandler {

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) {
			if (qName.equals("appliance")) {
				Appliance customAppliance;
				String type;

				type = attributes.getValue("type");

				customAppliance = switch (type) {
				case "oven" -> ovenCreator(attributes);
				case "tabletPC" -> tabletPCcreator(attributes);
				case "laptop" -> laptopCreator(attributes);
				case "refrigerator" -> refrigeratorCreator(attributes);
				case "vacuumCleaner" -> vacuumCleanerCreator(attributes);
				default -> null;
				};

				if (customAppliance != null) {
					xmlApplianceData.add(customAppliance);
				}

			}
		}

		private Refrigerator refrigeratorCreator(Attributes attributes) {

			int power = Integer.parseInt(attributes.getValue("power"));
			int weight = Integer.parseInt(attributes.getValue("weight"));
			int freezerCapacity = Integer.parseInt(attributes.getValue("freezerCapacity"));
			int overallCapacity = Integer.parseInt(attributes.getValue("overallCapacity"));
			int height = Integer.parseInt(attributes.getValue("height"));
			int width = Integer.parseInt(attributes.getValue("width"));

			return new Refrigerator(power, weight, freezerCapacity, overallCapacity, height, width);
		}

		private VacuumCleaner vacuumCleanerCreator(Attributes attributes) {

			int power = Integer.parseInt(attributes.getValue("power"));
			int motorSpeed = Integer.parseInt(attributes.getValue("motorSpeed"));
			int wandType = Integer.parseInt(attributes.getValue("wandType"));
			String filterType = attributes.getValue("filterType");
			String bagType = attributes.getValue("bagType");

			return new VacuumCleaner(power,  motorSpeed, wandType, filterType, bagType);
		}

		private Laptop laptopCreator(Attributes attributes) {

			int display = Integer.parseInt(attributes.getValue("display"));
			int cpu = Integer.parseInt(attributes.getValue("cpu"));
			int systemMemory = Integer.parseInt(attributes.getValue("systemMemory"));
			int memoryRom = Integer.parseInt(attributes.getValue("memoryRom"));
			String os = attributes.getValue("os");

			return new Laptop(os, systemMemory, cpu, display, memoryRom);
		}

		private TabletPC tabletPCcreator(Attributes attributes) {
			String colour = attributes.getValue("colour");
			int memoryRom = Integer.parseInt(attributes.getValue("memoryRom"));
			int batteryCapacity = Integer.parseInt(attributes.getValue("batteryCapacity"));
			int displayInches = Integer.parseInt(attributes.getValue("displayInches"));
			int flashMemory = Integer.parseInt(attributes.getValue("flashMemory"));

			return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemory, colour);
		}

		private Oven ovenCreator(Attributes attributes) {
			int power = Integer.parseInt(attributes.getValue("power"));
			int width = Integer.parseInt(attributes.getValue("width"));
			int height = Integer.parseInt(attributes.getValue("height"));
			int depth = Integer.parseInt(attributes.getValue("depth"));
			int capacity = Integer.parseInt(attributes.getValue("capacity"));
			int weight = Integer.parseInt(attributes.getValue("weight"));

			return new Oven(power, capacity, weight, depth, height, width);
		}
	}

}
