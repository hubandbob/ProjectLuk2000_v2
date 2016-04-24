package fr.ipst.cnam.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import fr.ipst.cnam.daos.ManagerDAO;
import fr.ipst.cnam.daos.OcDAO;
import fr.ipst.cnam.daos.OcDAOInterface;
import fr.ipst.cnam.entities.Oc;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = ManagerDAO.getInstance();
		OcDAOInterface dao = new OcDAO(emf);
		
		List<Oc> list = dao.findAllOc();
		
		if(list == null)
		{
			System.out.println("vide");
		}else
		{
			System.out.println("pleine");
		}
		
		/**/
		Iterator<Oc> it = list.iterator();
		
		
		
		
		while(it.hasNext())
		{
			Oc oc = it.next();
			System.out.println(oc.getDomaineAct());
		}
		

	}

}
