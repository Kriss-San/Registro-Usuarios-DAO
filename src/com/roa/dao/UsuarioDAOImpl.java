package com.roa.dao;

import com.roa.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {
    private static List<Usuario> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Usuario usuario) {
        baseDeDatos.add(usuario);
        System.out.println("Log: Datos guardados para el usuario " + usuario.getNombre());
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return baseDeDatos;
    }
}