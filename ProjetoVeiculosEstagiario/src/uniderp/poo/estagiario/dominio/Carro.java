package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Carro extends BaseVeiculo{
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Carro(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo, LocalDate anoFabriacao, String tipoVeiculo, String tipoCombustivel, String nome, String nomeProprietario,
        String fabricante, String modelo, String cor, String chassi, String placa, int rodas, int portas){
        super(codigo, codigoRenavam, cidade, estadoUF, anoModelo, anoFabriacao, tipoVeiculo, tipoCombustivel, nome, nomeProprietario, fabricante, modelo, cor, chassi, placa, rodas);
        this.portas = portas;
    }
    @Override

    public void Imprimir() {
    System.out.println("Codigo: " + this.codigo);
    System.out.println("codigoRenavam: " + this.codigoRenavam);
    System.out.println("Tipo de veiculo:" + this.tipoVeiculo);
    System.out.println("Nome Veiculo: " + this.nome);
    System.out.println("Proprietario: " + this.nomeProprietario);
    System.out.println("Cidade: " + this.cidade);
    System.out.println("Estado: " + this.estadoUF);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("cor: " + this.cor);
    System.out.println("placa: " + this.placa);
     System.out.println("portas: " + this.portas);
    System.out.println("Ano Modelo: " + this.anoModelo);
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Ano Fabricação: " + this.anoFabricação);
    System.out.println("Combustivel: " + this.tipoCombustivel);
}
