package fr.ipst.cnam.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import fr.ipst.cnam.daos.ManagerDAO;
import fr.ipst.cnam.daos.OcDAO;
import fr.ipst.cnam.daos.OcDAOInterface;

public class LazyParcOcModel extends LazyDataModel<Oc>{

	
	private List<Oc> parcOc;
	
	public LazyParcOcModel(List<Oc> datasource) {
		this.parcOc = datasource;
	}

	public List<Oc> getParcOc() {
		return parcOc;
	}

	public void setParcOc(List<Oc> parcOc) {
		this.parcOc = parcOc;
	}

	@Override
	public List<Oc> load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String, Object> filters) {
		
		//return super.load(first, pageSize, multiSortMeta, filters);
		EntityManagerFactory emf = ManagerDAO.getInstance();
		OcDAOInterface dao = new OcDAO(emf);
		
		List<Oc> list = dao.findAllOc();
		
		int datasize = list.size();
		this.setRowCount(datasize);
		
		return list;
	}

	
	
}
