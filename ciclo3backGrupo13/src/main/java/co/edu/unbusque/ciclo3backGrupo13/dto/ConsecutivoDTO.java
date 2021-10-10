package co.edu.unbusque.ciclo3backGrupo13.dto;

import java.io.Serializable;

public class ConsecutivoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;

	public ConsecutivoDTO(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
