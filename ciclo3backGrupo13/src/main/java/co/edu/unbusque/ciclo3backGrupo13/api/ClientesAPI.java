package co.edu.unbusque.ciclo3backGrupo13.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbusque.ciclo3backGrupo13.dao.ClientesDAO;
import co.edu.unbusque.ciclo3backGrupo13.model.Clientes;

@RestController
@RequestMapping("clientes")
public class ClientesAPI {

	@Autowired //inyecta la dependencia de todos los metodos del jpa al usuario a la variable usuarioDao
	private ClientesDAO clienteDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		clienteDao.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
		return clienteDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		clienteDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clienteDao.save(clientes);
	}
}
