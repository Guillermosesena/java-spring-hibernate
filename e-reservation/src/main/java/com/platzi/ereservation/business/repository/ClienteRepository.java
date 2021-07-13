/**
 * 
 */
package com.platzi.ereservation.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;


/**
 * Interface para definir las operacionesde bd relacionadas con cliente
 * @author g.sesena.pascacio
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
