package ec.edu.uce.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "procesador")
public class Procesador {

	@Id
	@Column(name = "proc_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_procesador") 
	@SequenceGenerator(name = "seq_procesador", sequenceName = "seq_procesador", allocationSize = 1)
	private Integer id;
	
	@Column(name = "proce_marca")
	private String marca;
	
	@Column(name = "proc_nucleos")
	private String nucleos;
	
	@OneToOne(mappedBy = "procesador", cascade = CascadeType.ALL)
	private Computadora computadora;

	
	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNucleos() {
		return nucleos;
	}

	public void setNucleos(String nucleos) {
		this.nucleos = nucleos;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
}
