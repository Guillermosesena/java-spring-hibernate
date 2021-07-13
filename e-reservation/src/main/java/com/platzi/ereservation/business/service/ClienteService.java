package com.platzi.ereservation.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.platzi.ereservation.business.repository.ClienteRepository;
import com.platzi.ereservation.model.Cliente;

/*
 * Clase para definir los servicios de cliente
 * @author guillermo
 * **/
@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	/**
	 * Método para realizar la operación de guardar un cliente 
	 * @param cliente
	 * @return
	 * */
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 *Método para realizar la opertación de actualizar un cliente
	 * @param cliente
	 * @return
	 * */
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	/**
	 * Método para relizar la operación de eliminar un cliente
	 * **/
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para consultar un cliente por su identificación
	 * */
	public Cliente findByIdenrificacion(String identificacionCli) {
		return this.clienteRepository.findByIdenrificacion(identificacionCli);
	}
}
