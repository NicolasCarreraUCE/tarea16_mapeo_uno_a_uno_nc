package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Procesador;

@Repository
@Transactional
public class ProcesadorRepoImpl implements IProcesadorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertraProcesador(Procesador procesador) {
		// TODO Auto-generated method stub
		this.entityManager.persist(procesador);
	}

}
