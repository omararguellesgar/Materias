package com.tec.alumnos.materias.model.response;

import java.util.List;

public class CursosResponse<Cursos> {
	private List<Cursos> cursos;

	/**
	 * Constructor vacio
	 * 
	 * @param materias
	 */
	public CursosResponse() {
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param materias
	 */
	public CursosResponse(List<Cursos> cursos) {
		super();
		this.cursos = cursos;
	}

	/**
	 * Metodo getter
	 * 
	 * @return the materias
	 */
	public List<Cursos> getCursos() {
		return cursos;
	}

	/**
	 * Metodo setter
	 * 
	 * @param materias the materias to set
	 */
	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}

	public void setMaterias(List<Cursos> list) {
		// TODO Auto-generated method stub
		
	}
}
