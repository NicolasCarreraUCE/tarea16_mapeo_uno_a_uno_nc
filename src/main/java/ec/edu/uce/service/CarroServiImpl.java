package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Carro;
import ec.edu.uce.repository.ICarroRepo;

@Service
public class CarroServiImpl implements ICarroServi {

	@Autowired
	private ICarroRepo carroRepo;

	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.insertarCarro(carro);
	}

}
