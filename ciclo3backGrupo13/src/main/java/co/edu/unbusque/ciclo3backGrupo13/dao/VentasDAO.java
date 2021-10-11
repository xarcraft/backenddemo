package co.edu.unbusque.ciclo3backGrupo13.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

import co.edu.unbusque.ciclo3backGrupo13.model.Ventas;
import co.edu.unbusque.ciclo3backGrupo13.dto.ConsecutivoDTO;

public interface VentasDAO extends JpaRepository<Ventas, Long>{
	
	//@Query(value = "select max(v.codigo_venta)+1 from ventas v")
	//long obtenerConsecutivo();
	//select max(v.codigo_venta)+1 from ventas v
	//select new co.edu.unbusque.ciclo3backGrupo13.dto.ConsecutivoDTO(nvl(max(v.codigo_venta),0)+1) from Ventas v
}
