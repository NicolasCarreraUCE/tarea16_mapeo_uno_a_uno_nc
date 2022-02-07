package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Motor;
import ec.edu.uce.repository.IMotorRepo;

@Service
public class MotorServiImpl implements IMotorServi {

	@Autowired
	private IMotorRepo motorRepo;
	
	@Override
	public void insertarMotor(Motor motor) {
		// TODO Auto-generated method stub
		this.motorRepo.insertarMotor(motor);
	}

}
