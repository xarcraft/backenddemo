package co.edu.unbusque.ciclo3backGrupo13.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_producto;

	private Integer nitproveedor;

	private String nombre_producto;
	private Double ivacompra;
	private Double precio_compra;
	private Double precio_venta;

	public productos() {
		super();
	}

	public productos(Integer codigo_producto, Integer nitproveedor, String nombre_producto, Double ivacompra,
			Double precio_compra, Double precio_venta) {
		super();
		this.codigo_producto = codigo_producto;
		this.nitproveedor = nitproveedor;
		this.nombre_producto = nombre_producto;
		this.ivacompra = ivacompra;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}

	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Integer getNitproveedor() {
		return nitproveedor;
	}

	public void setNitproveedor(Integer nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Double getIvacompra() {
		return ivacompra;
	}

	public void setIvacompra(Double ivacompra) {
		this.ivacompra = ivacompra;
	}

	public Double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}

	@Override
	public String toString() {
		return "productos [codigo_producto=" + codigo_producto + ", nitproveedor=" + nitproveedor + ", nombre_producto="
				+ nombre_producto + ", ivacompra=" + ivacompra + ", precio_compra=" + precio_compra + ", precio_venta="
				+ precio_venta + "]";
	}

}