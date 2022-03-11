package com.nttdata.demoweb.repo;

import java.util.List;

import com.nttdata.demoweb.repo.entity.Empleado;

public interface EmpleadoRepo {
	public void registrar(String nombre);
	List<Empleado> listarCuyoNombreContiene(String texto_nombre);
}
