package com.platzi.ereservation.view.resource.vo;

import lombok.Data;
import java.util.Set;



/**
 * Class that represents the client table
 * @author Guillermo
 * */
@Data
public class ClienteVO {
	
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;

}
