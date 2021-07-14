package com.platzi.ereservation.view.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.ereservation.business.service.ClienteService;
import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.view.resource.vo.ClienteVO;

/**
 * Clase que representa el servicio web de cliente 
 * 
 * **/
@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {
	
	private final ClienteService clienteService;
	
	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVo){
		Cliente cliente = new Cliente();
		cliente.setNombreCli(clienteVo.getNombreCli());
		cliente.setApellidoCli(clienteVo.getApellidoCli());
		cliente.setDireccionCli(clienteVo.getDireccionCli());
		cliente.setTelefonoCli(clienteVo.getTelefonoCli());
		cliente.setEmailCli(clienteVo.getEmailCli());
		return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{identificacion}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable("identificacion") String identificacion, 
			ClienteVO clienteVo){
		Cliente cliente = this.clienteService.findByIdentificacion(identificacion);
		if(cliente == null) {
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}else {
			cliente.setNombreCli(clienteVo.getNombreCli());
			cliente.setApellidoCli(clienteVo.getApellidoCli());
			cliente.setDireccionCli(clienteVo.getDireccionCli());
			cliente.setTelefonoCli(clienteVo.getTelefonoCli());
			cliente.setEmailCli(clienteVo.getEmailCli());
		}
		
		return new ResponseEntity<>(this.clienteService.update(cliente), HttpStatus.OK);
	}
	

	@DeleteMapping("/{identificacion}")
	public void remoteCliente(@PathVariable("identificacion") String identificacion) {
		Cliente cliente = this.clienteService.findByIdentificacion(identificacion);
		if(cliente != null) {
			this.clienteService.delete(cliente);
		}
	}
	

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.ok(this.clienteService.findAll());
	}

}
