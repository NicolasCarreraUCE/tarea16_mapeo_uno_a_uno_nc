package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Computadora;

@Repository
@Transactional
public class ComputadoraRepoImpl implements IComputadoraRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertraComputadora(Computadora computadora) {
		// TODO Auto-generated method stub
		this.entityManager.persist(computadora);
	}

}
