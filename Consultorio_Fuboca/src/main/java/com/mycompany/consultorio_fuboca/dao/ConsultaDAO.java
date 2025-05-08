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
import com.mycompany.consultorio_fuboca.modelo.Consulta;
import java.sql.*;
import java.util.ArrayList;

public class ConsultaDAO {

    public void inserir(Consulta consulta) {
        String sql = "INSERT INTO consulta (observacao, data, hora, idPaciente, idMedico) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, consulta.getObservacao());
            stmt.setDate(2, Date.valueOf(consulta.getData()));
            stmt.setTime(3, Time.valueOf(consulta.getHora()));
            stmt.setInt(4, consulta.getIdPaciente());
            stmt.setInt(5, consulta.getIdMedico());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Consulta> listar() {
        ArrayList<Consulta> lista = new ArrayList<>();
        String sql = "SELECT * FROM consulta";
        try (Connection conn = ConexaoMySQL.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Consulta c = new Consulta(
                    rs.getInt("idConsulta"),
                    rs.getString("observacao"),
                    rs.getDate("data").toLocalDate(),
                    rs.getTime("hora").toLocalTime(),
                    rs.getInt("idPaciente"),
                    rs.getInt("idMedico")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizar(Consulta consulta) {
        String sql = "UPDATE consulta SET observacao = ?, data = ?, hora = ?, idPaciente = ?, idMedico = ? WHERE idConsulta = ?";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, consulta.getObservacao());
            stmt.setDate(2, Date.valueOf(consulta.getData()));
            stmt.setTime(3, Time.valueOf(consulta.getHora()));
            stmt.setInt(4, consulta.getIdPaciente());
            stmt.setInt(5, consulta.getIdMedico());
            stmt.setInt(6, consulta.getIdConsulta());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int idConsulta) {
        String sql = "DELETE FROM consulta WHERE idConsulta = ?";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idConsulta);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}