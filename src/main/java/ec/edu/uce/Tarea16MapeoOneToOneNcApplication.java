package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Carro;
import ec.edu.uce.modelo.Computadora;
import ec.edu.uce.modelo.Motor;
import ec.edu.uce.modelo.Procesador;
import ec.edu.uce.service.IMotorServi;
import ec.edu.uce.service.IProcesadorServi;

@SpringBootApplication
public class Tarea16MapeoOneToOneNcApplication implements CommandLineRunner {

	@Autowired
	private IProcesadorServi procesadorServi;
	
	@Autowired
	private IMotorServi motorServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea16MapeoOneToOneNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Computadora
		Computadora computadora = new Computadora();
		computadora.setRam("16GB");
		computadora.setMemoria("250GB SSD");
		
		Procesador procesador = new Procesador();
		procesador.setMarca("Intel");
		procesador.setNucleos("6");
		procesador.setComputadora(computadora);
		
		computadora.setProcesador(procesador);
		
		this.procesadorServi.insertraProcesador(procesador);

		// Carro
		Carro carro = new Carro();
		carro.setMarca("Chevrotel");
		carro.setModelo("Nissan");
		
		Motor motor = new Motor();
		motor.setCombustible("Gasolina");
		motor.setCaballosFuerza("50HP");
		motor.setCarro(carro);
		
		carro.setMotor(motor);
		
		this.motorServi.insertarMotor(motor);
	}

}
