package com.sistematiendab3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistematiendab3.model.Usuario;
import com.sistematiendab3.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
@Autowired

private UsuarioRepository usuarioRepository;

public List<Usuario> listarTodas(){
	return usuarioRepository.findAll();
}

public Usuario guardar(Usuario usuario) {
	return usuarioRepository.save(usuario);
}

public Usuario obtenerPorId(Long id) {
	return usuarioRepository.findById(id).orElse(null);
}

public void eliminar(Long id) {
	usuarioRepository.deleteById(id);
}

}
