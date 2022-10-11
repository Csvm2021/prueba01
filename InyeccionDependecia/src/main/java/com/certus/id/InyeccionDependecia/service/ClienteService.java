package com.certus.id.InyeccionDependecia.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.certus.id.InyeccionDependecia.model.Cliente;

@Component
public class ClienteService implements IClienteService{

	@Override
	public List<Cliente> nuevoCliente() {
		
		Cliente clientito = new Cliente();
		Cliente clientito2 = new Cliente();
		
		List<Cliente> listaClientes = null;
		
		clientito.setNombre("Jose");
		clientito.setApellido("Castillo");
		clientito.setDNI("74958675");
		
		clientito2.setNombre("Alejo");
		clientito2.setApellido("Sanchez");
		clientito2.setDNI("76851489");
		
		listaClientes.add(clientito);
		listaClientes.add(clientito2);
		
		return listaClientes;
	}

}