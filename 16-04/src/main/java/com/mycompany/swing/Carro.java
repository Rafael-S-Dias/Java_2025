/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;

/**
 *
 * @author aluno.den
 */
public class Carro extends Veiculo{
    private int portas;

    public Carro(int portas, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    
     @Override
    public String toString() {
        return super.toString()+ " | Portas: " + portas;
    }       
    
    
}
