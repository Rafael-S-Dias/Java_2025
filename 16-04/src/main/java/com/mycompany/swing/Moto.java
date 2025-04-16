/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;

/**
 *
 * @author aluno.den
 */
public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(int cilindradas, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString()+ " | Cilindradas: " + cilindradas;
    } 
    
}
