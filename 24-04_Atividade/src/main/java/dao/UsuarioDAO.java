/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Usuario;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioDAO() {
        usuarios.add( new Usuario("admin", "admin123"));
        usuarios.add( new Usuario("usuario", "1234"));
    }

    public boolean autenticar(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
