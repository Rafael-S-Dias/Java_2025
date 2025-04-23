package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDao {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioDao() {
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
