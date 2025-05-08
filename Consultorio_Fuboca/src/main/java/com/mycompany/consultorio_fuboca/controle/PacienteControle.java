/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.controle;

/**
 *
 * @author aluno.den
 */

import com.mycompany.consultorio_fuboca.dao.PacienteDAO;
import com.mycompany.consultorio_fuboca.modelo.Paciente;
import java.util.ArrayList;

public class PacienteControle {

    private PacienteDAO dao = new PacienteDAO();

    public void cadastrar(String nomePaciente, String cpf, String ddd, String numTelefone, String primeiroNome, String nomeDoMeio, String ultimoNome) {
        Paciente p = new Paciente(nomePaciente, cpf, ddd, numTelefone, primeiroNome, nomeDoMeio, ultimoNome);
        dao.inserir(p);
    }

    public ArrayList<Paciente> listar() {
        return dao.listar();
    }

    public void atualizar(int idPaciente, String nomePaciente, String cpf, String ddd, String numTelefone, String primeiroNome, String nomeDoMeio, String ultimoNome) {
        Paciente p = new Paciente(idPaciente, nomePaciente, cpf, ddd, numTelefone, primeiroNome, nomeDoMeio, ultimoNome);
        dao.atualizar(p);
    }

    public void remover(int idPaciente) {
        dao.remover(idPaciente);
    }

    public ArrayList<Paciente> buscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }
}
