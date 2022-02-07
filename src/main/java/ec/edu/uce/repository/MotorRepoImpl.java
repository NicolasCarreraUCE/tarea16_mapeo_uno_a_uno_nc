package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Motor;

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

}
