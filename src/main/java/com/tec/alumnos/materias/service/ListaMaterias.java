package com.tec.alumnos.materias.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tec.alumnos.materias.model.response.CursosResponse;
import com.tec.alumnos.materias.model.response.MateriasResponse;

@Service
public class ListaMaterias<Cursos> {
	/**
	 * Metodo para obetener la materia segun sea el caso
	 * 
	 * @param idMateria
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public CursosResponse<Cursos> getMateria(long idMateria) {
		List<Cursos> list = new ArrayList<>();
		CursosResponse<Cursos> materiasResponse = new CursosResponse<>(list);
		materiasResponse.setMaterias(list);
		if (idMateria == 1) {
			MateriasResponse materia1 = new MateriasResponse("POO");
			list.add((Cursos) materia1);
		} else if (idMateria == 2) {
			MateriasResponse materia2 = new MateriasResponse("FSI");
			list.add((Cursos) materia2);
		} else if (idMateria == 3) {
			MateriasResponse materia3 = new MateriasResponse("FPI");
			list.add((Cursos) materia3);
		} else if (idMateria == 4) {
			MateriasResponse materia4 = new MateriasResponse("CONTABILIDAD");
			list.add((Cursos) materia4);
		} else if (idMateria == 5) {
			MateriasResponse materia5 = new MateriasResponse("CALCULO");
			list.add((Cursos) materia5);
		}

		return materiasResponse;
	}
}
