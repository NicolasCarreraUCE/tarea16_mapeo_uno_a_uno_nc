package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

	@Override
	public Procesador buscarProcesadorPorMarcaJOIN(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Procesador> myQuery = this.entityManager.createQuery("SELECT p FROM Procesador p JOIN p.computadora c WHERE p.marca =:marca", Procesador.class);
		myQuery.setParameter("marca", marca);
		return myQuery.getSingleResult();
	}

	@Override
	public Procesador buscarProcesadorPorMarcaLEFTJOIN(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Procesador> myQuery = this.entityManager.createQuery("SELECT p FROM Procesador p LEFT JOIN p.computadora c WHERE p.marca =:marca", Procesador.class);
		myQuery.setParameter("marca", marca);
		return myQuery.getSingleResult();
	}

	@Override
	public Procesador buscarProcesadorPorMarcaRIGHTJOIN(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Procesador> myQuery = this.entityManager.createQuery("SELECT p FROM Procesador p RIGHT JOIN p.computadora c WHERE p.marca =:marca", Procesador.class);
		myQuery.setParameter("marca", marca);
		return myQuery.getSingleResult();
	}

	@Override
	public Procesador buscarProcesadorPorMarcaWHERE(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Procesador> myQuery = this.entityManager.createQuery("SELECT p FROM Procesador p, Computadora c WHERE p = c.procesador AND p.marca =:marca", Procesador.class);
		myQuery.setParameter("marca", marca);
		return myQuery.getSingleResult();
	}

}
