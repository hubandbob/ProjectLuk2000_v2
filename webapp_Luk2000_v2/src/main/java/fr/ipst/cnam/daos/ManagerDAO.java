package fr.ipst.cnam.daos;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerDAO {

	private static EntityManagerFactory emf;
	
	private ManagerDAO() {
		emf = Persistence.createEntityManagerFactory("Luk2000PU");
	}
	
	public static EntityManagerFactory getInstance()
	{
		if(emf == null)
		{
			new ManagerDAO();
			return emf;
		}
		else
		{
			return emf;
		}
	}
}
