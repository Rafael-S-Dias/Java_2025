/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.controle;

import com.mycompany.consultorio_fuboca.dao.ConsultaDAO;
import com.mycompany.consultorio_fuboca.modelo.Consulta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class ConsultaControle {
    private ConsultaDAO dao = new ConsultaDAO();

    public void cadastrar(String observacao, LocalDate data, LocalTime hora, int idPaciente, int idMedico) {
        Consulta c = new Consulta(observacao, data, hora, idPaciente, idMedico);
        dao.inserir(c);
    }

    public ArrayList<Consulta> listar() {
        return dao.listar();
    }

    public void atualizar(int idConsulta, String observacao, LocalDate data, LocalTime hora, int idPaciente, int idMedico) {
        Consulta c = new Consulta(idConsulta, observacao, data, hora, idPaciente, idMedico);
        dao.atualizar(c);
    }

    public void remover(int idConsulta) {
        dao.remover(idConsulta);
    }
}

