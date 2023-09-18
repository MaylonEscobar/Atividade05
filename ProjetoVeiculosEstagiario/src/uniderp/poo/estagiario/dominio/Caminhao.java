package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Caminhao extends BaseVeiculo {
    private double pesoLiquido;
    private double pesoTotal;
    private int eixos;
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getEixo() {
        return eixos;
    }
    public void setEixo(int eixo) {
        this.eixos = eixo;
    }

    public Caminhao(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo, LocalDate anoFabriacao, String tipoVeiculo,
        String tipoCombustivel, String nome, String nomeProprietario, String fabricante, String modelo, String cor, String chassi, String placa, int rodas, 
        int portas, double potencia, double pesoLiquido, double pesoTotal, int eixos){
        super(codigo, codigoRenavam, cidade, estadoUF, anoModelo, anoFabriacao, tipoVeiculo, tipoCombustivel, nome, nomeProprietario, fabricante, modelo, cor, chassi, placa, rodas);
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.eixos = eixos;
    }
    
}
