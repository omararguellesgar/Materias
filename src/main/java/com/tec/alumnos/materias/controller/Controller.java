package com.tec.alumnos.materias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tec.alumnos.materias.model.response.CursosResponse;
import com.tec.alumnos.materias.model.response.MateriasResponse;
import com.tec.alumnos.materias.service.ListaMaterias;

@RestController
public class Controller {

	/**
	 * Inyeccion del servicio lista materias
	 */
	@Autowired
	private ListaMaterias<?> listaMaterias;

	/**
	 * Metodo con el param y el response
	 *
	 * @param idMateria
	 * @return retorno del tipo de materia
	 */
	@GetMapping("/getMateriaEstudiante")
	public CursosResponse<?> getMateria(@RequestParam long idMateria) {
		/**
		 * Retorno del objeto
		 */
		return listaMaterias.getMateria(idMateria);
	}

}
