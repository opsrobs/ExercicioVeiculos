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

    public int idadesDosVeiculos(int idadeVeiculo) {
        int qtd = 0;

        for (Veiculo listaVeiculo : this.listaVeiculos) {
            if (2021 - listaVeiculo.getAno() >= idadeVeiculo) {
                ++qtd;
            }
        }

        return qtd;
    }

    public float percentualCarros(int ano) {
        int qtd = 0;

        for (Veiculo listaVeiculo : this.listaVeiculos) {
            if (2021 - listaVeiculo.getAno() <= ano) {
                ++qtd;
            }
        }

        return (float)qtd / Float.parseFloat(String.valueOf(this.listaVeiculos.size())) * 100.0F;
    }

    public int qtdPorCorEMontadora(String cor, String montadora) {
        int qtd = 0;

        for (Veiculo listaVeiculo : this.listaVeiculos) {
            if (listaVeiculo.getCor().equalsIgnoreCase(cor) && listaVeiculo.getMontadora().equalsIgnoreCase(montadora)) {
                ++qtd;
            }
        }

        return qtd;
    }

    public float percentualPorCorEMontadora(String cor, String montadora, String motor, int ano) {
        int qtd = 0;
        for (Veiculo listaVeiculo : this.listaVeiculos) {
            if (listaVeiculo.getCor().equalsIgnoreCase(cor) &&
                    listaVeiculo.getMontadora().equalsIgnoreCase(montadora) &&
                    listaVeiculo.getMotor().equalsIgnoreCase(motor) &&
                    listaVeiculo.getAno() > ano) {
                ++qtd;
            }
        }

        return (float)(qtd / this.listaVeiculos.size() * 100);
    }
    private final ArrayList<Veiculo> listaDeVeiculos = new ArrayList();

    public void retornarListaDeVeiculos(Veiculo veiculo) {
        this.listaDeVeiculos.add(veiculo);
    }
    Veiculo veiculoNovo;

    public void validadorPlaca() {
        String[] vogais = new String[]{"A", "E", "I", "O", "U"};

        for (Veiculo listaVeiculo : this.listaVeiculos) {
            String placa = listaVeiculo.getPlaca();
            int ano = listaVeiculo.getAno();
            String motor = listaVeiculo.getMotor();
            String chassi = listaVeiculo.getChasi();
            String cor = listaVeiculo.getCor();
            String montadora = listaVeiculo.getMontadora();
            this.veiculoNovo = new Veiculo(placa, ano, motor, chassi, cor, montadora);

            for (String vogai : vogais) {
                if (listaVeiculo.getPlaca().startsWith(vogai)) {
                    int alterPlaca = Integer.parseInt(String.valueOf(placa.charAt(7)));
                    if (alterPlaca % 2 == 0) {
                        this.retornarListaDeVeiculos(this.veiculoNovo);
                    }
                }

            }
        }

    }

    public String dadosPlacaFiltrada(){
        ArrayList<String> veiculo = new ArrayList<>();

        String dadosVeiculo;
        for (Veiculo listaDeVeiculo : listaDeVeiculos) {
            dadosVeiculo = "Placa: " + listaDeVeiculo.getPlaca() +
                    "\nAno: " + listaDeVeiculo.getAno() +
                    "\nMotor: " + listaDeVeiculo.getMotor() +
                    "\nChassi :" + listaDeVeiculo.getChasi() +
                    "\nCor: " + listaDeVeiculo.getCor() +
                    "\nMontadora: " + listaDeVeiculo.getMontadora();

            veiculo.add(dadosVeiculo);

        }

        return String.valueOf(veiculo);
    }
    @Override
    public String toString(){
        return  "\nA quantidade de veiculos na cidade é: "+ this.listaVeiculos.size()+
                "\nA quantidade de veiculos com mais de 10 anos de circulação é: "+ idadesDosVeiculos(10)+
                "\nA quantidade de veiculos com mais de 20 anos de circulação é: "+ idadesDosVeiculos(20)+
                "\nA quantidade de veiculos com menos de 5 anos de circulação é: "+ percentualCarros(5)+
                "\nA quantidade de veiculos na cor BRANCA da montadora FIAT é: "+ qtdPorCorEMontadora("branca", "fiat")+
                "\nA quantidade de veiculos na cor PRATA da montadora RENAULT, com motor 1.0 e ano superior a 1995: "+
                percentualPorCorEMontadora("prata","renault","1.0",1995)+"\n"+
                "\nA Lista de veiculos que começam com vogais e terminam com numero par é: \n\n"+dadosPlacaFiltrada();

    }
}
