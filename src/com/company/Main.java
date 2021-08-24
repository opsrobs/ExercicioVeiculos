package com.company;
import javax.swing.*;

import static com.company.ServicoVeiculo.*;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculo;
        ServicoVeiculo servicoVeiulo = new ServicoVeiculo();

        String placa= JOptionPane.showInputDialog("Informe a placa do veiculo: ").toUpperCase();

        while (!placa.equalsIgnoreCase("fim")){
            int ano= Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo [ex: 0000] ou (FIM) sair: "));
            String motor= JOptionPane.showInputDialog("Informe o motor do veiculo: ");
            String chassi= JOptionPane.showInputDialog("Informe o chassi do veiculo: ");
            String cor= JOptionPane.showInputDialog("Informe a cor do veiculo: ").toUpperCase();
            String montadora= JOptionPane.showInputDialog("Informe a montadora do veiculo: ").toUpperCase();
            veiculo = new Veiculo(placa,ano,motor,chassi,cor,montadora);

            servicoVeiulo.retornarListaVeiculos(veiculo);
            servicoVeiulo.validadorPlaca();
            placa= JOptionPane.showInputDialog("Informe a placa do veiculo: ").toUpperCase();
        }
        System.out.println(servicoVeiulo.toString());


    }
}
