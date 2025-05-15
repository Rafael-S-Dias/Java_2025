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
import com.mycompany.consultorio_fuboca.modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PacienteDAO {

    public void inserir(Paciente paciente) {
        String sql = "INSERT INTO paciente (cpf, ddd, numTelefone, primeiroNomePaciente, nomeDoMeioPaciente, ultimoNomePaciente) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getCpf());
            stmt.setString(2, paciente.getDdd());
            stmt.setString(3, paciente.getNumTelefone());
            stmt.setString(4, paciente.getPrimeiroNomePaciente());
            stmt.setString(5, paciente.getNomeDoMeioPaciente());
            stmt.setString(6, paciente.getUltimoNomePaciente());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Paciente> listar() {
        ArrayList<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try (Connection conn = ConexaoMySQL.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Paciente p = new Paciente(
                    rs.getInt("idPaciente"),
                    rs.getString("cpf"),
                    rs.getString("ddd"),
                    rs.getString("numTelefone"),
                    rs.getString("primeiroNomePaciente"),
                    rs.getString("nomeDoMeioPaciente"),
                    rs.getString("ultimoNomePaciente")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Paciente> buscarPorId(String idPaciente) {
        ArrayList<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente WHERE idPaciente LIKE ?";

        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + idPaciente + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Paciente p = new Paciente(
                    rs.getInt("idPaciente"),
                    rs.getString("cpf"),
                    rs.getString("ddd"),
                    rs.getString("numTelefone"),
                    rs.getString("primeiroNomePaciente"),
                    rs.getString("nomeDoMeioPaciente"),
                    rs.getString("ultimoNomePaciente")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(Paciente paciente) {
        String sql = "UPDATE paciente SET cpf = ?, ddd = ?, numTelefone = ?, primeiroNomePaciente = ?, nomeDoMeioPaciente = ?, ultimoNomePaciente = ? WHERE idPaciente = ?";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getCpf());
            stmt.setString(2, paciente.getDdd());
            stmt.setString(3, paciente.getNumTelefone());
            stmt.setString(4, paciente.getPrimeiroNomePaciente());
            stmt.setString(5, paciente.getNomeDoMeioPaciente());
            stmt.setString(6, paciente.getUltimoNomePaciente());
            stmt.setInt(7, paciente.getIdPaciente());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int idPaciente) {
        String sql = "DELETE FROM paciente WHERE idPaciente = ?";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPaciente);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
