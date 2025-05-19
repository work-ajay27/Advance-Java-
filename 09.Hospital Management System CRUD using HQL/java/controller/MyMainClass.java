package controller;

import java.util.List;
import java.util.Scanner;

import dao.PatientDAO;
import model.Patient;

public class MyMainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Hospital management System");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 5) {

			System.out.println("1.Add Patient");
			System.out.println("2.View Patient");
			System.out.println("3.Search Patient");
			System.out.println("4.Delete Patient");
			System.out.println("5.Exit Patient");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Name");
				String name = sc.next();

				System.out.println("Enter Surname");
				String surname = sc.next();

				System.out.println("Enter Disease");
				String disease = sc.next();

				System.out.println("Enter Age");
				int age = sc.nextInt();

				Patient patient = new Patient(age, name, surname, disease);
				PatientDAO patientdao = new PatientDAO();
				patientdao.addPatient(patient);

				System.out.println("******** Information Added ******************");
				break;

			case 2:
				System.out.println("Details Of All the Patients");

				PatientDAO showDetails = new PatientDAO();

//				showDetails.displayPatientInfo();
				showDetails.showPatients() ;

//				System.out.println(showDetails.displayPatientInfo());
		break;

				
			case 3:
				System.out.println("Enter Patient's Id to Search Patient Data.");
				int patientID = sc.nextInt();

				PatientDAO searchById = new PatientDAO();
				searchById.searchPatientInfo(patientID);

				Patient pt = new Patient();

				break;

			case 4:
				System.out.println("Enter Patient ID to Delete");
				int deleteRecord = sc.nextInt();
				PatientDAO DeleteById = new PatientDAO();
				DeleteById.deletePatientData(deleteRecord);
				break;
			case 5:
				System.out.println(" ********  Thank You. Visit Again *********");
				break;
			}
		}
	}
}
