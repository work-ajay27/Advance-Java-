package main;

import controller.AddPlantInfo;
import controller.SeePlantDetails;

public class MyMainClass {
	public static void main(String[] args) {

//		new AddPlantInfo().addPlant();
		new SeePlantDetails().viewDetails("Tulsi");
	}
}
