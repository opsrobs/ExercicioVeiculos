package com.company;

public class Veiculo {
    private String placa;
    private int ano;
    private String motor;
    private String chasi;
    private String cor;
    private String montadora;

    public Veiculo(String placa, int ano, String motor, String chasi, String cor, String montadora) {
        this.placa = placa;
        this.ano = ano;
        this.motor = motor;
        this.chasi = chasi;
        this.cor = cor;
        this.montadora = montadora;
    }

        public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasi() {
        return chasi;
    }

    public void setChasi(String chasi) {
        this.chasi = chasi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }
}
