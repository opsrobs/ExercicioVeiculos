//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;

public class ServicoVeiculo {
    private ArrayList<Veiculo> listaVeiculos = new ArrayList();

    public void retornarListaVeiculos(Veiculo veiculo) {
        this.listaVeiculos.add(veiculo);
    }

    public int qtdeVeiculos() {
        int qtd = this.listaVeiculos.size();
        return qtd;
    }

    public int idadesDosVeiculos(int idadeVeiculo) {
        int qtd = 0;

        for(int i = 0; i < this.listaVeiculos.size(); ++i) {
            if (2021 - ((Veiculo)this.listaVeiculos.get(i)).getAno() >= idadeVeiculo) {
                ++qtd;
            }
        }

        return qtd;
    }

    public float percentualCarros(int ano) {
        int qtd = 0;

        for(int i = 0; i < this.listaVeiculos.size(); ++i) {
            if (2021 - ((Veiculo)this.listaVeiculos.get(i)).getAno() <= ano) {
                ++qtd;
            }
        }

        float percentual = (float)qtd / Float.parseFloat(String.valueOf(this.listaVeiculos.size())) * 100.0F;
        return percentual;
    }

    public int qtdPorCorEMontadora(String cor, String montadora) {
        int qtd = 0;

        for(int i = 0; i < this.listaVeiculos.size(); ++i) {
            if (((Veiculo)this.listaVeiculos.get(i)).getCor().equalsIgnoreCase(cor) && ((Veiculo)this.listaVeiculos.get(i)).getMontadora().equalsIgnoreCase(montadora)) {
                ++qtd;
            }
        }

        return qtd;
    }

    public float percentualPorCorEMontadora(String cor, String montadora, String motor, int ano) {
        int qtd = 0;
        for(int i = 0; i < this.listaVeiculos.size(); ++i) {
            if (this.listaVeiculos.get(i).getCor().equalsIgnoreCase(cor) &&
                this.listaVeiculos.get(i).getMontadora().equalsIgnoreCase(montadora) &&
                this.listaVeiculos.get(i).getMotor().equalsIgnoreCase(motor) &&
                this.listaVeiculos.get(i).getAno() > ano) {
                ++qtd;
            }
        }

        float percentual = (float)(qtd / this.listaVeiculos.size() * 100);
        return percentual;
    }
    private ArrayList<Veiculo> listaDeVeiculos = new ArrayList();

    public void retornarListaDeVeiculos(Veiculo veiculo) {
        this.listaDeVeiculos.add(veiculo);
    }
    Veiculo veiculoNovo;

    public void validadorPlaca() {
        String[] vogais = new String[]{"a", "e", "i", "o", "u"};

        for(int i = 0; i < this.listaVeiculos.size(); ++i) {
            String placa = this.listaVeiculos.get(i).getPlaca();
            int ano = this.listaVeiculos.get(i).getAno();
            String motor = this.listaVeiculos.get(i).getMotor();
            String chassi = this.listaVeiculos.get(i).getChasi();
            String cor = this.listaVeiculos.get(i).getCor();
            String montadora = this.listaVeiculos.get(i).getMontadora();
            this.veiculoNovo = new Veiculo(placa, ano, motor, chassi, cor, montadora);

            for(int j = 0; j < vogais.length; ++j) {
                if (this.listaVeiculos.get(i).getPlaca().startsWith(vogais[j])) {
                    int alterPlaca = Integer.parseInt(String.valueOf(placa.charAt(7)));
                    if (alterPlaca % 2 == 0) {
                        this.retornarListaDeVeiculos(this.veiculoNovo);
                    }
                }

            }
        }

    }

    public String dadosPlacaFiltrada(){
        String veiculo="sem dados...";
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            veiculo="\nPlaca: "+ this.listaDeVeiculos.get(i).getPlaca()+
                    "\nAno: "+ this.listaDeVeiculos.get(i).getAno()+
                    "\nMotor: "+ this.listaDeVeiculos.get(i).getMotor()+
                    "\nChassi :"+ this.listaDeVeiculos.get(i).getChasi()+
                    "\nCor: "+ this.listaDeVeiculos.get(i).getPlaca()+
                    "\nMontadora: "+ this.listaDeVeiculos.get(i).getPlaca();

        }

        return veiculo;
    }
    @Override
    public String toString(){
        return "\nA quantidade de veiculos na cidade é: "+ qtdeVeiculos()+
                "\nA quantidade de veiculos com mais de 10 anos de circulação é: "+ idadesDosVeiculos(10)+
                "\nA quantidade de veiculos com mais de 20 anos de circulação é: "+ idadesDosVeiculos(20)+
                "\nA quantidade de veiculos com menos de 5 anos de circulação é: "+ percentualCarros(5)+
                "\nA quantidade de veiculos na cor BRANCA da montadora FIAT é: "+ qtdPorCorEMontadora("branca", "fiat")+
                "\nA quantidade de veiculos na cor PRATA da montadora RENAULT, com motor 1.0 e ano superior a 1995: "+ percentualPorCorEMontadora("prata","renault","1.0",1995)+
                "\nA Lista de veiculos que começam com vogais e terminam com numero par é: "+dadosPlacaFiltrada();

    }
}
