package ec.edu.uce.service;

import ec.edu.uce.modelo.Procesador;

public interface IProcesadorServi {
	void insertraProcesador(Procesador procesador);
	
	Procesador buscarProcesadorPorMarcaJOIN(String marca);
	Procesador buscarProcesadorPorMarcaLEFTJOIN(String marca);
	Procesador buscarProcesadorPorMarcaRIGHTJOIN(String marca);
	Procesador buscarProcesadorPorMarcaWHERE(String marca);
}
