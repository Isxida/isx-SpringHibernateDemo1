package service;

import java.util.List;

import bean.Cliente;

public interface ClienteService {
	
	public void addCliente(Cliente cli);
	public List<Cliente> listCliente();
	public void deleteCliente(Integer id);
	
}
