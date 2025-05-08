/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.modelo;

/**
 *
 * @author aluno.den
 */
public class Medico {
    private int idMedico;
    private String crm;
    private String nomeMedico;
    private String especializacao;
    private String primeiroNomeMedico;
    private String nomeDoMeioMedico;
    private String ultimoNomeMedico;

    public Medico() {
    }

    public Medico(String crm, String nomeMedico, String especializacao,
                  String primeiroNomeMedico, String nomeDoMeioMedico, String ultimoNomeMedico) {
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.especializacao = especializacao;
        this.primeiroNomeMedico = primeiroNomeMedico;
        this.nomeDoMeioMedico = nomeDoMeioMedico;
        this.ultimoNomeMedico = ultimoNomeMedico;
    }

    public Medico(int idMedico, String crm, String nomeMedico, String especializacao,
                  String primeiroNomeMedico, String nomeDoMeioMedico, String ultimoNomeMedico) {
        this.idMedico = idMedico;
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.especializacao = especializacao;
        this.primeiroNomeMedico = primeiroNomeMedico;
        this.nomeDoMeioMedico = nomeDoMeioMedico;
        this.ultimoNomeMedico = ultimoNomeMedico;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getPrimeiroNomeMedico() {
        return primeiroNomeMedico;
    }

    public void setPrimeiroNomeMedico(String primeiroNomeMedico) {
        this.primeiroNomeMedico = primeiroNomeMedico;
    }

    public String getNomeDoMeioMedico() {
        return nomeDoMeioMedico;
    }

    public void setNomeDoMeioMedico(String nomeDoMeioMedico) {
        this.nomeDoMeioMedico = nomeDoMeioMedico;
    }

    public String getUltimoNomeMedico() {
        return ultimoNomeMedico;
    }

    public void setUltimoNomeMedico(String ultimoNomeMedico) {
        this.ultimoNomeMedico = ultimoNomeMedico;
    }
    
    
}
