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

import co.edu.unbusque.ciclo3backGrupo13.dao.ProductosDAO;
import co.edu.unbusque.ciclo3backGrupo13.model.Productos;

@RestController //es la que representa el objeto tipo Rest
@RequestMapping("productos")
public class ProductosAPI {

	@Autowired //inyecta la dependencia de todos los metodos del jpa al producto a la variable productoDao
	private ProductosDAO productoDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Productos productos) {
		productoDao.save(productos);
	}
	
	@GetMapping("/listar")
	public List<Productos> listar(){
		return productoDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		productoDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productoDao.save(productos);
	}
}
