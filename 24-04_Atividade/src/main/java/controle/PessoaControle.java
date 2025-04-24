/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.PessoaDAO;
import java.util.ArrayList;
import modelo.Pessoa;
/**
 *
 * @author aluno.den
 */
public class PessoaControle {
    private PessoaDAO dao = new PessoaDAO();
    
    public void cadastrar(String nome, int idade) {
        Pessoa p = new Pessoa(nome, idade);
        dao.adcionar(p);
}
    
    public ArrayList<Pessoa> listar() {
        return dao.listar();
    }
}