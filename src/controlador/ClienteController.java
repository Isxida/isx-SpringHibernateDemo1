package controlador;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.Cliente;

import service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService cliService;
	
	@RequestMapping("/")
	public String listaClientes(Map<String,Object> map){
		map.put("cliente", new Cliente());
		map.put("listaClientes", cliService.listCliente());
		return "cliente";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCliente(@ModelAttribute("cliente")
							Cliente cli, BindingResult result){
		
		cliService.addCliente(cli);
		return "redirect:/";
	}
							
	
	
	@RequestMapping("/delete/{clienteId}")
	public String deleteContact(@PathVariable("clienteId") Integer clienteId){
		cliService.deleteCliente(clienteId);
		return "redirect:/";
	}
	
}
