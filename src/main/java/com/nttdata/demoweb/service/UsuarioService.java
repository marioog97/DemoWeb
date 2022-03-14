package com.nttdata.demoweb.service;

import java.util.List;

import com.nttdata.demoweb.repo.entity.Usuario;

public interface UsuarioService {
	List<Usuario> listar();
	Usuario buscarPorUsername(String username);
}
