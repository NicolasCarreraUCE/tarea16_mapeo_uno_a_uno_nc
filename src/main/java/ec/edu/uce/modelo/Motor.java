package ec.edu.uce.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "motor")
public class Motor {

	@Id
	@Column(name = "moto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_motor") 
	@SequenceGenerator(name = "seq_motor", sequenceName = "seq_motor", allocationSize = 1)
	private Integer id;
	
	@Column(name = "moto_combustible")
	private String combustible;
	
	@Column(name = "moto_caballos_fuerza")
	private String caballosFuerza;
	
	@OneToOne(mappedBy = "motor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Carro carro;
	
	@Override
	public String toString() {
		return "Motor [id=" + id + ", combustible=" + combustible + ", caballosFuerza=" + caballosFuerza + ", carro="
				+ carro + "]";
	}

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getCaballosFuerza() {
		return caballosFuerza;
	}

	public void setCaballosFuerza(String caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
