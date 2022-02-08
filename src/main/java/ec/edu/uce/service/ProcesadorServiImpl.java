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

	@Override
	public Procesador buscarProcesadorPorMarcaJOIN(String marca) {
		// TODO Auto-generated method stub
		return this.procesadorRepo.buscarProcesadorPorMarcaJOIN(marca);
	}

	@Override
	public Procesador buscarProcesadorPorMarcaLEFTJOIN(String marca) {
		// TODO Auto-generated method stub
		return this.procesadorRepo.buscarProcesadorPorMarcaLEFTJOIN(marca);
	}

	@Override
	public Procesador buscarProcesadorPorMarcaRIGHTJOIN(String marca) {
		// TODO Auto-generated method stub
		return this.procesadorRepo.buscarProcesadorPorMarcaRIGHTJOIN(marca);
	}

	@Override
	public Procesador buscarProcesadorPorMarcaWHERE(String marca) {
		// TODO Auto-generated method stub
		return this.procesadorRepo.buscarProcesadorPorMarcaWHERE(marca);
	}

}
