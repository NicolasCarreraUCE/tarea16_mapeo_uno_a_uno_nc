package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Motor;
import ec.edu.uce.modelo.Procesador;

@Repository
@Transactional
public class MotorRepoImpl implements IMotorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarMotor(Motor motor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(motor);
	}

	@Override
	public Motor buscarMotorPorCaballosDeFuerzaJOIN(String caballosFuerza) {
		// TODO Auto-generated method stub
		TypedQuery<Motor> myQuery = this.entityManager.createQuery("SELECT m FROM Motor m JOIN m.carro c WHERE m.caballosFuerza =:fuerza", Motor.class);
		myQuery.setParameter("fuerza", caballosFuerza);
		return myQuery.getSingleResult();
	}

	@Override
	public Motor buscarMotorPorCaballosDeFuerzaLEFTJOIN(String caballosFuerza) {
		// TODO Auto-generated method stub
		TypedQuery<Motor> myQuery = this.entityManager.createQuery("SELECT m FROM Motor m LEFT JOIN m.carro c WHERE m.caballosFuerza =:fuerza", Motor.class);
		myQuery.setParameter("fuerza", caballosFuerza);
		return myQuery.getSingleResult();
	}

	@Override
	public Motor buscarMotorPorCaballosDeFuerzaRIGHTJOIN(String caballosFuerza) {
		// TODO Auto-generated method stub
		TypedQuery<Motor> myQuery = this.entityManager.createQuery("SELECT m FROM Motor m RIGHT JOIN m.carro c WHERE m.caballosFuerza =:fuerza", Motor.class);
		myQuery.setParameter("fuerza", caballosFuerza);
		return myQuery.getSingleResult();
	}

	@Override
	public Motor buscarMotorPorCaballosDeFuerzaWHERE(String caballosFuerza) {
		// TODO Auto-generated method stub
		TypedQuery<Motor> myQuery = this.entityManager.createQuery("SELECT m FROM Motor m, Carro c WHERE m = c.motor AND m.caballosFuerza =:fuerza", Motor.class);
		myQuery.setParameter("fuerza", caballosFuerza);
		return myQuery.getSingleResult();
	}

}
