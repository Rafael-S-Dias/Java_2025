/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.controle;

import com.mycompany.consultorio_fuboca.dao.MedicoDAO;
import com.mycompany.consultorio_fuboca.modelo.Medico;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class MedicoControle {

    private MedicoDAO dao = new MedicoDAO();

    public void cadastrar(String crm, String especializacao, String primeiroNome, String nomeDoMeio, String ultimoNome) {
        Medico m = new Medico(crm, especializacao, primeiroNome, nomeDoMeio, ultimoNome);
        dao.inserir(m);
    }

    public ArrayList<Medico> listar() {
        return dao.listar();
    }

    public void atualizar(int idMedico, String crm, String especializacao, String primeiroNome, String nomeDoMeio, String ultimoNome) {
        Medico m = new Medico(idMedico, crm, especializacao, primeiroNome, nomeDoMeio, ultimoNome);
        dao.atualizar(m);
    }

    public void remover(int idMedico) {
        dao.remover(idMedico);
    }
}