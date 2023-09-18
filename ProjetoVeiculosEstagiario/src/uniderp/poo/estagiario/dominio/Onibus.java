package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Onibus extends BaseVeiculo {
    private int assentos;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public Onibus(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo, LocalDate anoFabriacao, String tipoVeiculo,
        String tipoCombustivel, String nome, String nomeProprietario, String fabricante, String modelo, String cor, String chassi, String placa, int rodas, 
        int portas, double potencia, double pesoLiquido, double pesoTotal, int eixos, int assentos){
        super(codigo, codigoRenavam, cidade, estadoUF, anoModelo, anoFabriacao, tipoVeiculo, tipoCombustivel, nome, nomeProprietario, fabricante, modelo, cor, chassi, placa, rodas);
        this.assentos = assentos;   
    }
}
