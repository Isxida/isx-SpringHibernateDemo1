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
		// TODO Auto-generated method stub
		clienteDao.addCliente(cli);
	}

	@Transactional
	public List<Cliente> listCliente() {
		// TODO Auto-generated method stub
		return clienteDao.listCliente();
	}

	@Transactional
	public void deleteCliente(Integer id) {
		// TODO Auto-generated method stub
		clienteDao.deleteCliente(id);
	}

}
