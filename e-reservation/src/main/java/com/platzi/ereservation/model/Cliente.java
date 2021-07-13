package com.platzi.ereservation.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;



/**
 * Class that represents the client table
 * @author Guillermo
 * */
@Data
@Entity
@Table(name="cliente")
@NamedQuery(name="Client.findByIdentificacion", query="Select c "
		+ "from Cliente c where c.identificacionCli = ?1")
public class Cliente {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy="uuid2")
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	
	@OneToMany(mappedBy="cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {

	}


}
