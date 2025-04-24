/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Pessoa;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class PessoaDAO {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adcionar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public ArrayList<Pessoa> listar(){
        return pessoas;
    }
}

