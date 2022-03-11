package com.nttdata.demoweb.service;
import java.util.List;

import com.nttdata.demoweb.repo.entity.Empleado;

public interface EmpleadoService {
 public void registrar(String name);
 public List<Empleado> listar();
 public List<Empleado> listarFiltroNombre(String cad);
 public List<Empleado> listarConJPA(Integer pId, String contiene);
 public List<Empleado> filtrarCuyoNombreEs(String cad);
 Empleado inserta(Empleado emp);
}
