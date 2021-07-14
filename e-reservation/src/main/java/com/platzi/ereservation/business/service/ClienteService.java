package com.platzi.ereservation.business.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.business.repository.ClienteRepository;
import com.platzi.ereservation.model.Cliente;

/*
 * Clase para definir los servicios de cliente
 * @author guillermo
 * **/
@Service
@Transactional(readOnly = true)
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
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 *Método para realizar la opertación de actualizar un cliente
	 * @param cliente
	 * @return
	 * */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	/**
	 * Método para relizar la operación de eliminar un cliente
	 * **/
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para consultar un cliente por su identificación
	 * */
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
}
