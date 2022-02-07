package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Carro;

@Repository
@Transactional
public class CarroRepoImpl implements ICarroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(carro);
	}

}
