package controle;

import dao.UsuarioDao;

public class ControleLogin {
    private UsuarioDao usuarioDao;

    public ControleLogin() {

        usuarioDao = new UsuarioDao();
    }

    public boolean autenticar(String login, String senha) {
        return usuarioDao.autenticar(login, senha);
    }
}
