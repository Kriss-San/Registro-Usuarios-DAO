package com.roa.dao;

import com.roa.modelo.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    void guardar(Usuario usuario);
    List<Usuario> obtenerTodos();
}