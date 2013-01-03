package dao;

import java.util.List;

import bean.Cliente;


public interface ClienteDAO {
	
	public void addCliente(Cliente cli);
	public List<Cliente> listCliente();
	public void deleteCliente(Integer id);
	
}
