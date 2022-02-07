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
@Table(name = "carro")
public class Carro {

	@Id
	@Column(name = "carr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_carro") 
	@SequenceGenerator(name = "seq_carro", sequenceName = "seq_carro", allocationSize = 1)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "carr_id_motor")
	private Motor motor;
	
	@Column(name = "carr_marca")
	private String marca;
	
	@Column(name = "carr_modelo")
	private String modelo;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
