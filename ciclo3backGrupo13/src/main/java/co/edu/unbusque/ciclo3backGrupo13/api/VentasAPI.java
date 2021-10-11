package co.edu.unbusque.ciclo3backGrupo13.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbusque.ciclo3backGrupo13.dao.VentasDAO;
import co.edu.unbusque.ciclo3backGrupo13.dto.ConsecutivoDTO;
import co.edu.unbusque.ciclo3backGrupo13.model.Usuarios;
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
	@GetMapping("/listar")
	public List<Ventas> listar(){
		return ventasDao.findAll();
	}

}
