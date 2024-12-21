package com.sistematiendab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sistematiendab3.model.Usuario;
import com.sistematiendab3.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	
	@GetMapping
	public String listarUsuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.listarTodas());
		return "usuario-list";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioNuevaPersona(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario-form";
	}
	
	@PostMapping
	public String guardarUsuarios(Usuario usuario) {
		usuarioService.guardar(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/editar/{id}")
	public String mostrarFormularioEditarUsuario(@PathVariable Long id, Model model) {
		model.addAttribute("usuario", usuarioService.obtenerPorId(id));
		return "usuario-form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarUsuario(@PathVariable Long id) {
		usuarioService.eliminar(id);
		return "redirect:/usuarios";
	}    	
}
