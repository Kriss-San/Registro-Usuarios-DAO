package com.roa.main;

import com.roa.modelo.Usuario;
import com.roa.dao.IUsuarioDAO;
import com.roa.dao.UsuarioDAOImpl;
import java.util.Scanner; // Importar la herramienta para leer teclado

public class Main {
    public static void main(String[] args) {
        IUsuarioDAO dao = new UsuarioDAOImpl();
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- SISTEMA DE REGISTRO DE USUARIOS (PATRÓN DAO) ---");

        // Leer nombre desde la consola
        System.out.print("Ingrese nombre del usuario: ");
        String nombre = teclado.nextLine();

        // Leer email desde la consola
        System.out.print("Ingrese email del usuario: ");
        String email = teclado.nextLine();

        // Crear el objeto y registrarlo
        Usuario nuevo = new Usuario(nombre, email);
        dao.guardar(nuevo);

        // Mostrar el resultado final
        System.out.println("\n--- VERIFICACIÓN DE REGISTROS ON-CHAIN (SIMULADA) ---");
        for (Usuario u : dao.obtenerTodos()) {
            System.out.println("Usuario: " + u.getNombre() + " | Email: " + u.getEmail());
        }

        teclado.close();
    }
}