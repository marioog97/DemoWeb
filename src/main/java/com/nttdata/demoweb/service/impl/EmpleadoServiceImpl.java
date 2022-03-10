package com.nttdata.demoweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repo.EmpleadoRepo;
import com.nttdata.demoweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepo repo;
	
	@Override
	public void registrar(String name) {
		repo.registrar(name);
	}
}
