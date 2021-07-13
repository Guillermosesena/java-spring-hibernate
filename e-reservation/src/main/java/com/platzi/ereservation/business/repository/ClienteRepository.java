/**
 * 
 */
package com.platzi.ereservation.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;


/**
 * Interface para definir las operacionesde bd relacionadas con cliente
 * @author g.sesena.pascacio
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definición de método para buscar a los clientes por su apellido
	 * */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	
	public Cliente findByIdenrificacion(String identificacionCli);
	

}
