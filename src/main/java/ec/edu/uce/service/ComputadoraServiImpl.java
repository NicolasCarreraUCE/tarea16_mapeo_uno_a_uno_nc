package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Computadora;
import ec.edu.uce.repository.IComputadoraRepo;

@Service
public class ComputadoraServiImpl implements IComputadoraServi {

	@Autowired
	private IComputadoraRepo computadoraRepo;
	
	@Override
	public void insertraComputadora(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.insertraComputadora(computadora);
	}

}
