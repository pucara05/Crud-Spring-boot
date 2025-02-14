package com.Crud_Springboot.demo.services;

import com.Crud_Springboot.demo.models.Usuario;
import com.Crud_Springboot.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    private final UsuarioRepository    usuarioRepository;

    // Inyección de dependencias a través del constructor
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;

    }

    // Crear o guardar un usuario
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }


    // Listar todos los usuarios
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<Usuario> obtenerUsuariosPorId(Long id){
        return usuarioRepository.findById(id);
    }

// Actualizar un usuario
    public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado) {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        if (optional.isPresent()) {
            Usuario usuarioExistente = optional.get();
            usuarioExistente.setName(usuarioActualizado.getName());
            usuarioExistente.setEmail(usuarioActualizado.getEmail());
            return usuarioRepository.save(usuarioExistente);
        } else {
            throw new RuntimeException("No se encontró el usuario con ID: " + id);
        }
    }


// Eliminar un usuario
    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }


}
