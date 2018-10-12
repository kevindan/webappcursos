package models;

import java.util.List;

public class Alumno {

	private int idAlumno;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private String dni;
	private String fecnac;
	private List<Curso> cursos;
	private int estado;

	public Alumno() {

	}

	public Alumno(int idAlumno, String nombre, String appaterno, String apmaterno, String dni, String fecnac,
			List<Curso> cursos, int estado) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.dni = dni;
		this.fecnac = fecnac;
		this.cursos = cursos;
		this.estado = estado;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppaterno() {
		return appaterno;
	}

	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}

	public String getApmaterno() {
		return apmaterno;
	}

	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecnac() {
		return fecnac;
	}

	public void setFecnac(String fecnac) {
		this.fecnac = fecnac;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", appaterno=" + appaterno + ", apmaterno="
				+ apmaterno + ", dni=" + dni + ", fecnac=" + fecnac + ", cursos=" + cursos + ", estado=" + estado + "]";
	}

}
