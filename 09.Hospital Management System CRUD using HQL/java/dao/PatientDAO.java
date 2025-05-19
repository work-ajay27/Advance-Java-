package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Patient;

public class PatientDAO {
	static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//	Add Patient
	public void addPatient(Patient patient) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(patient);
		transaction.commit();
		session.close();
	}

//2.	Display All Patient
	public List<Patient> displayPatientInfo() {

		Session session = sf.openSession();
		String HQLQuery = "from Patient";

		Query<Patient> query = session.createQuery(HQLQuery, Patient.class);

		List<Patient> list = query.getResultList();

		return list;
	}

	public void showPatients() {
		
		PatientDAO dao = new PatientDAO();
		
		List<Patient> patients = dao.displayPatientInfo();

		for (Patient p : patients) {
			System.out.println("ID: " + p.getId());
			System.out.println("Name: " + p.getName());
			System.out.println("Age: " + p.getAge());
			System.out.println("Disease: " + p.getDisease());
			System.out.println("----------------------");
		}
	}

//3. Search Patient Info By Id.

	public void searchPatientInfo(int patientId) {

		Session session = sf.openSession();
		Transaction transcation = session.beginTransaction();

		String HQL = "FROM Patient p WHERE p.id = :patientId";

		Query<Patient> query = session.createQuery(HQL, Patient.class);
		query.setParameter("patientId", patientId);
		Patient patient = query.uniqueResult();

		if (patient != null) {
			System.out.println("Patient Found: " + patient);
		} else {
			System.out.println("No Patient found with ID: " + patientId);
		}

		transcation.commit();
		session.close();

	}

//	4. Delete Patients Data

	public void deletePatientData(int patientId) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		String HQL = "DELETE from Patient p where p.id= :patientId";

//		Query<Patient> query = session.createQuery(HQL, Patient.class);  Don't use this line It will Give error. 
		Query<Patient> query = session.createQuery(HQL);
		query.setParameter("patientId", patientId);

		int result = query.executeUpdate(); // Executes delete query

		if (result > 0) {
			System.out.println("Patient with ID " + patientId + " deleted successfully.");
		} else {
			System.out.println("No Patient found with ID: " + patientId);
		}

		transaction.commit();
		session.close();

	}
}
