/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.modelo;

/**
 *
 * @author aluno.den
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private int idConsulta;
    private String observacao;
    private LocalDate data;
    private LocalTime hora;
    private int idPaciente;
    private int idMedico;

    public Consulta() {
        
    }
    
    public Consulta(String observacao, LocalDate data, LocalTime hora, int idPaciente, int idMedico) {
        this.observacao = observacao;
        this.data = data;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public Consulta(int idConsulta, String observacao, LocalDate data, LocalTime hora, int idPaciente, int idMedico) {
        this.idConsulta = idConsulta;
        this.observacao = observacao;
        this.data = data;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    
}