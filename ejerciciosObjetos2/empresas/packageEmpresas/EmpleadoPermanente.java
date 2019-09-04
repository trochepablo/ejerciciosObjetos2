package packageEmpresas;

import java.util.Date;

public class EmpleadoPermanente extends Empleado {

	public EmpleadoPermanente(String nombre, String direccion, Boolean estaCasado, Date fechaNacimiento,
			Double sueldoBasico) {
		super(nombre, direccion, estaCasado, fechaNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSueldoBruto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getRetenciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSueldoNeto() {
		// TODO Auto-generated method stub
		return null;
	}

}
