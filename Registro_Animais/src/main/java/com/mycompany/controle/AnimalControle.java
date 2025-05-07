/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.dao.AnimalDAO;
import com.mycompany.modelo.Animal;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class AnimalControle {
    private AnimalDAO dao = new AnimalDAO();

    public void cadastrar(String nome, String especie, int idade) {
        Animal a = new Animal(nome, especie, idade);
        dao.inserir(a);
    }

    public ArrayList<Animal> listar() {
        return dao.listar();
    }

    public void atualizar(int id, String nome, String especie, int idade) {
        Animal a = new Animal(id, nome, especie, idade);
        dao.atualizar(a);
    }

    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Animal> buscarPorNome(String nome) {
    return dao.buscarPorNome(nome);
}
}
