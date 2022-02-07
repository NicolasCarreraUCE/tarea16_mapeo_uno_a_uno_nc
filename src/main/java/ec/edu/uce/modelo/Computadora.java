package ec.edu.uce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "computadora")
public class Computadora {

	@Id
	@Column(name = "comp_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_computadora") 
	@SequenceGenerator(name = "seq_computadora", sequenceName = "seq_computadora", allocationSize = 1)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "comp_id_procesador")
	private Procesador procesador;
	
	@Column(name = "comp_ram")
	private String ram;
	
	@Column(name = "comp_memoria")
	private String memoria;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
}
