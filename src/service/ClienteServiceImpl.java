package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ClienteDAO;

import bean.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	public ClienteDAO clienteDao;
	
	@Transactional
	public void addCliente(Cliente cli) {
		clienteDao.addCliente(cli);
	}
		
	public List<Cliente> listCliente() {
		return clienteDao.listCliente();
	}

	@Transactional
	public void deleteCliente(Integer id) {
		clienteDao.deleteCliente(id);
	}

}
