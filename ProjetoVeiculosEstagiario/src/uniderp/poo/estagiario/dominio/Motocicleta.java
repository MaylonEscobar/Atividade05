package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Motocicleta extends BaseVeiculo {
    private double potencia;

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public Motocicleta(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo,
        LocalDate anoFabriacao, String tipoVeiculo, String tipoCombustivel, String nome, String nomeProprietario,
        String fabricante, String modelo, String cor, String chassi, String placa, int rodas, double potencia){
        super(codigo, codigoRenavam, cidade, estadoUF, anoModelo, anoFabriacao, tipoVeiculo, tipoCombustivel, nome, nomeProprietario, fabricante, modelo, cor, chassi, placa, rodas);
        this.potencia = potencia;
    }
    @Override
public void Imprimir() {
    System.out.println("Codigo: " + this.codigo);
    System.out.println("Tipo de veiculo:" + this.tipoVeiculo);
    System.out.println("Nome Veiculo: " + this.nome);
    System.out.println("Proprietario: " + this.nomeProprietario);
    System.out.println("Cidade: " + this.cidade);
    System.out.println("Estado: " + this.estadoUF);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano Modelo: " + this.anoModelo);
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Ano Fabricação: " + this.anoFabricação);
    System.out.println("Combustivel: " + this.tipoCombustivel);

}

 

