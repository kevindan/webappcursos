package dao;

import java.util.ArrayList;
import java.util.List;

import interfaces.IAlumno;
import models.Alumno;
import models.Curso;

public class AlumnoDao implements IAlumno {

	@Override
	public List<Alumno> listarAlumnos() {

		List<Curso> listaCursos1 = new ArrayList<Curso>();

		listaCursos1.add(new Curso(1, "Matematicas", 11.50, 15.20, 14.50, 19.00, 13.00, 10.50, 09.50));
		listaCursos1.add(new Curso(1, "Comunicación", 10.50, 11.00, 09.50, 08.00, 05.00, 14.50, 10.50));
		listaCursos1.add(new Curso(1, "Personal Social", 13.00, 19.00, 11.50, 10.00, 09.00, 05.50, 09.50));
		listaCursos1.add(new Curso(1, "Ciencia y Tecnología", 14.50, 10.20, 15.50, 14.00, 12.00, 11.50, 09.50));

		List<Curso> listaCursos2 = new ArrayList<Curso>();

		listaCursos2.add(new Curso(1, "Matematicas", 09.00, 06.20, 14.50, 19.00, 06.00, 10.50, 09.50));
		listaCursos2.add(new Curso(1, "Comunicación", 05.50, 08.00, 09.50, 08.00, 05.00, 14.50, 10.50));
		listaCursos2.add(new Curso(1, "Personal Social", 09.00, 08.00, 07.50, 05.00, 05.00, 05.50, 09.50));
		listaCursos2.add(new Curso(1, "Ciencia y Tecnología", 11.50, 10.20, 20.00, 16.00, 19.00, 19.50, 09.50));

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno(1, "Hildefoncio", "Pamfilo", "Tiburcio", "01458962", "01/01/2001", listaCursos1, 1));
		listaAlumnos.add(new Alumno(2, "Anacleto", "Robles", "Maldonado", "14785498", "02/06/2008", listaCursos2 , 1));
		
		return listaAlumnos;
	}

}
