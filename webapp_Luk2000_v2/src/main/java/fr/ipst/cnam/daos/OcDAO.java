package fr.ipst.cnam.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import fr.ipst.cnam.entities.Oc;

public class OcDAO implements OcDAOInterface{
	
	private EntityManagerFactory emf;
	
	public OcDAO(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public EntityManager getEntityManager()
	{
		EntityManager em = emf.createEntityManager();
		return em;
	}

	@Override
	public void persistOc(Oc oc) {
		
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(oc);
		em.getTransaction().commit();
	}

	@Override
	public Oc findOc(Oc oc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Oc> findAllOc() {
		EntityManager em = getEntityManager();
		try
		{
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(Oc.class));
			Query q = em.createQuery(cq);
			return q.getResultList();
			
		}
		finally
		{
			em.close();
		}
	}

	@Override
	public void updateOc(Oc oc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyOc(Oc oc) {
		// TODO Auto-generated method stub
		
	}

}
