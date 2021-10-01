package co.edu.unbusque.ciclo3backGrupo13.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbusque.ciclo3backGrupo13.dao.Detalle_VentaDAO;
import co.edu.unbusque.ciclo3backGrupo13.model.Detalle_Venta;

@RestController
@RequestMapping("detalle_venta")
public class Detalle_VentaAPI {
	
	@Autowired
	private Detalle_VentaDAO detalle_ventaDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_Venta detalle_venta) {
		detalle_ventaDao.save(detalle_venta);
	}

}
