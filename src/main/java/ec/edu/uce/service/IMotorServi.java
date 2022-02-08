package ec.edu.uce.service;

import ec.edu.uce.modelo.Motor;

public interface IMotorServi {
	void insertarMotor(Motor motor);
	
	Motor buscarMotorPorCaballosDeFuerzaJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaLEFTJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaRIGHTJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaWHERE(String caballosFuerza);
}
