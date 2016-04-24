package fr.ipst.cnam.daos;

import java.util.List;

import fr.ipst.cnam.entities.Oc;

public interface OcDAOInterface {
	
	public void persistOc(Oc oc);
	
	public Oc findOc(Oc oc);
	
	public List<Oc> findAllOc();
	
	public void updateOc(Oc oc);
	
	public void destroyOc(Oc oc);

}
