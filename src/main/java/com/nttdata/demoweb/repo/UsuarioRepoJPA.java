package com.nttdata.demoweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nttdata.demoweb.repo.entity.Usuario;

public interface UsuarioRepoJPA extends JpaRepository<Usuario, String> {

}
