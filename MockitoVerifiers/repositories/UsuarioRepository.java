package Taller5.MockitoVerifiers.repositories;

import java.util.List;

import Taller5.MockitoVerifiers.models.Usuario;

public interface UsuarioRepository {
    void agregarUsuario(Usuario usuario);
    Usuario obtenerUsuario(String id);
    void eliminarUsuario(String id);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
}