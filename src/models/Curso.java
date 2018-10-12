package models;

public class Curso {

	private int idCurso;
	private String nombreCurso;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double nota5;
	private double nota6;
	private double nota7;

	public Curso() {

	}

	public Curso(int idCurso, String nombreCurso, double nota1, double nota2, double nota3, double nota4, double nota5,
			double nota6, double nota7) {

		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.nota5 = nota5;
		this.nota6 = nota6;
		this.nota7 = nota7;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNota5() {
		return nota5;
	}

	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}

	public double getNota6() {
		return nota6;
	}

	public void setNota6(double nota6) {
		this.nota6 = nota6;
	}

	public double getNota7() {
		return nota7;
	}

	public void setNota7(double nota7) {
		this.nota7 = nota7;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", nota4=" + nota4 + ", nota5=" + nota5 + ", nota6=" + nota6 + ", nota7=" + nota7
				+ "]";
	}

}
