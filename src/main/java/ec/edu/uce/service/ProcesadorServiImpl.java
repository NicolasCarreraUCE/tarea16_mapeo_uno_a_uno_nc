package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Procesador;
import ec.edu.uce.repository.IProcesadorRepo;

@Service
public class ProcesadorServiImpl implements IProcesadorServi {

	@Autowired
	private IProcesadorRepo procesadorRepo;
	
	@Override
	public void insertraProcesador(Procesador procesador) {
		// TODO Auto-generated method stub
		this.procesadorRepo.insertraProcesador(procesador);
	}

}
