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

import co.edu.unbusque.ciclo3backGrupo13.dao.ProveedoresDAO;
import co.edu.unbusque.ciclo3backGrupo13.model.Proveedores;

@RestController //es la que representa el objeto tipo Rest
@RequestMapping("proveedores")
public class ProveedoresAPI {

	@Autowired
	private ProveedoresDAO proveedoresDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Proveedores proveedores) {
		proveedoresDao.save(proveedores);
	}
	
	@GetMapping("/listar")
	public List<Proveedores> listar(){
		return proveedoresDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		proveedoresDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Proveedores proveedores) {
		proveedoresDao.save(proveedores);
	}
}
