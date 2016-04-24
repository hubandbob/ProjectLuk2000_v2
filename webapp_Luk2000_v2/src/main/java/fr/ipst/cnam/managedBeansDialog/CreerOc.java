package fr.ipst.cnam.managedBeansDialog;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManagerFactory;

import fr.ipst.cnam.controllers.CrudOc;
import fr.ipst.cnam.daos.ManagerDAO;
import fr.ipst.cnam.daos.OcDAO;
import fr.ipst.cnam.daos.OcDAOInterface;

@ManagedBean
@SessionScoped
public class CreerOc {
	
	private String domaineAct;
	
	private String nom;
	
	private int idProprio;

	public String getDomaineAct() {
		return domaineAct;
	}

	public void setDomaineAct(String domaineAct) {
		this.domaineAct = domaineAct;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdProprio() {
		return idProprio;
	}

	public void setIdProprio(int idProprio) {
		this.idProprio = idProprio;
	}
	
	public void valider()
	{
		CrudOc control = new CrudOc();
		control.valider(this);
	}

}
