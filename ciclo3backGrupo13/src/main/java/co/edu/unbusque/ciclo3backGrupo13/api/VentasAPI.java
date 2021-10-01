package co.edu.unbusque.ciclo3backGrupo13.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbusque.ciclo3backGrupo13.dao.VentasDAO;
import co.edu.unbusque.ciclo3backGrupo13.model.Ventas;

@RestController
@RequestMapping("ventas")
public class VentasAPI {

	@Autowired
	private VentasDAO ventasDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Ventas ventas) {
		ventasDao.save(ventas);
	}
}
