/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultorio_fuboca.dao;

/**
 *
 * @author aluno.den
 */

import com.mycompany.consultorio_fuboca.connectMySQL.ConexaoMySQL;
import com.mycompany.consultorio_fuboca.modelo.Medico;
import java.sql.*;
import java.util.ArrayList;


public class MedicoDAO {
    
    public void inserir(Medico medico) {
        String sql = "INSERT INTO medico (crm, especializacao, primeiroNomeMedico, nomeDoMeioMedico, ultimoNomeMedico) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medico.getCrm());
            stmt.setString(2, medico.getEspecializacao());
            stmt.setString(3, medico.getPrimeiroNomeMedico());
            stmt.setString(4, medico.getNomeDoMeioMedico());
            stmt.setString(5, medico.getUltimoNomeMedico());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public ArrayList<Medico> listar() {
        ArrayList<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medico";
        try (Connection conn = ConexaoMySQL.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medico m = new Medico(
                    rs.getInt("idMedico"),
                    rs.getString("crm"),
                    rs.getString("especializacao"),
                    rs.getString("primeiroNomeMedico"),
                    rs.getString("nomeDoMeioMedico"),
                    rs.getString("ultimoNomeMedico")
                );
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizar(Medico medico) {
        String sql = "UPDATE medico SET crm = ?, especializacao = ?, primeiroNomeMedico = ?, nomeDoMeioMedico = ?, ultimoNomeMedico = ? WHERE idMedico = ?";
        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medico.getCrm());
            stmt.setString(2, medico.getEspecializacao());
            stmt.setString(3, medico.getPrimeiroNomeMedico());
            stmt.setString(4, medico.getNomeDoMeioMedico());
            stmt.setString(5, medico.getUltimoNomeMedico());
            stmt.setInt(6, medico.getIdMedico());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Medico> buscarPorId(String idMedico) {
        ArrayList<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente WHERE idPaciente LIKE ?";

        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + idMedico + "%");
            ResultSet rs = stmt.executeQuery();

           while (rs.next()) {
                Medico m = new Medico(
                    rs.getInt("idMedico"),
                    rs.getString("crm"),
                    rs.getString("especializacao"),
                    rs.getString("primeiroNomeMedico"),
                    rs.getString("nomeDoMeioMedico"),
                    rs.getString("ultimoNomeMedico")
                );
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void remover(int idMedico) {
        String sql = "DELETE FROM medico WHERE idMedico = ?";
        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMedico);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}