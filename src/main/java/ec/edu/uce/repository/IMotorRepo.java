package ec.edu.uce.repository;

import ec.edu.uce.modelo.Motor;

public interface IMotorRepo {
	void insertarMotor(Motor motor);
	
	Motor buscarMotorPorCaballosDeFuerzaJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaLEFTJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaRIGHTJOIN(String caballosFuerza);
	Motor buscarMotorPorCaballosDeFuerzaWHERE(String caballosFuerza);
}
