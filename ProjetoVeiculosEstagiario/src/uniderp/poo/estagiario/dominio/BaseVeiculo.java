package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public abstract class BaseVeiculo extends BaseDadosComuns {
    protected String nome;
    protected String nomeProprietario;
    protected String tipoVeiculo;
    protected String fabricante;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected String placa;
    protected int rodas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }   
    public BaseVeiculo(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo,
        LocalDate anoFabriacao, String tipoVeiculo, String tipoCombustivel, String nome, String nomeProprietario,
        String fabricante, String modelo, String cor, String chassi, String placa, int rodas){
        super(codigo, codigoRenavam, cidade, estadoUF, anoModelo, anoFabriacao, tipoCombustivel);   
        this.nome = nome;
        this.nomeProprietario = nomeProprietario;
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.rodas = rodas;
    }

}
