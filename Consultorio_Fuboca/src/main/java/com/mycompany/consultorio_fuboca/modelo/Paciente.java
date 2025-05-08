/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.modelo;

/**
 *
 * @author aluno.den
 */
public class Paciente {
    private int idPaciente;
    private String nomePaciente;
    private String cpf;
    private String ddd;
    private String numTelefone;
    private String primeiroNomePaciente;
    private String nomeDoMeioPaciente;
    private String ultimoNomePaciente;

    public Paciente() {
    }

 
    public Paciente(String nomePaciente, String cpf, String ddd, String numTelefone,
                    String primeiroNomePaciente, String nomeDoMeioPaciente, String ultimoNomePaciente) {
        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.ddd = ddd;
        this.numTelefone = numTelefone;
        this.primeiroNomePaciente = primeiroNomePaciente;
        this.nomeDoMeioPaciente = nomeDoMeioPaciente;
        this.ultimoNomePaciente = ultimoNomePaciente;
    }

    public Paciente(int idPaciente, String nomePaciente, String cpf, String ddd, String numTelefone,
                    String primeiroNomePaciente, String nomeDoMeioPaciente, String ultimoNomePaciente) {
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.ddd = ddd;
        this.numTelefone = numTelefone;
        this.primeiroNomePaciente = primeiroNomePaciente;
        this.nomeDoMeioPaciente = nomeDoMeioPaciente;
        this.ultimoNomePaciente = ultimoNomePaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getPrimeiroNomePaciente() {
        return primeiroNomePaciente;
    }

    public void setPrimeiroNomePaciente(String primeiroNomePaciente) {
        this.primeiroNomePaciente = primeiroNomePaciente;
    }

    public String getNomeDoMeioPaciente() {
        return nomeDoMeioPaciente;
    }

    public void setNomeDoMeioPaciente(String nomeDoMeioPaciente) {
        this.nomeDoMeioPaciente = nomeDoMeioPaciente;
    }

    public String getUltimoNomePaciente() {
        return ultimoNomePaciente;
    }

    public void setUltimoNomePaciente(String ultimoNomePaciente) {
        this.ultimoNomePaciente = ultimoNomePaciente;
    }
    
    
}
