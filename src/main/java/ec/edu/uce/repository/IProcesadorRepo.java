package ec.edu.uce.repository;

import ec.edu.uce.modelo.Procesador;

public interface IProcesadorRepo {
	void insertraProcesador(Procesador procesador);
	
	Procesador buscarProcesadorPorMarcaJOIN(String marca);
	Procesador buscarProcesadorPorMarcaLEFTJOIN(String marca);
	Procesador buscarProcesadorPorMarcaRIGHTJOIN(String marca);
	Procesador buscarProcesadorPorMarcaWHERE(String marca);
}
