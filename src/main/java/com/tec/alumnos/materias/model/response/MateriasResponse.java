package com.tec.alumnos.materias.model.response;

public class MateriasResponse {
	String materia;

	/**
	 * constructor vacio
	 * 
	 * @param list
	 */
	public MateriasResponse() {
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param materia
	 */
	public MateriasResponse(String materia) {
		super();
		this.materia = materia;
	}

	/**
	 * Metodo getter
	 * 
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * Metodo setter
	 * 
	 * @param list the materia to set
	 */
	public void setMateria(String list) {
		this.materia = list;
	}

}
