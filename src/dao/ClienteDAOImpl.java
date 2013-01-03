package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.Cliente;
@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
	@Autowired
	public SessionFactory sessionF;
	
	@Override
	public void addCliente(Cliente cli) {
		sessionF.getCurrentSession().save(cli);

	}

	@Override
	public List<Cliente> listCliente() {
		return sessionF.getCurrentSession().createQuery("from Clientes").list();
	}

	@Override
	public void deleteCliente(Integer id) {
		
		Cliente cli = (Cliente) sessionF.getCurrentSession().load(Cliente.class, id);
		//validar usuario existente
		if(null != cli )
			sessionF.getCurrentSession().delete(cli);
		
	}

}
