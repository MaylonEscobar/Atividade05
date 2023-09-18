package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public class Aviao extends BaseVeiculo{
    private int qtdeMotores;
    private int qtdeOcupantes;

    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotor(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupante() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupante(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public Aviao(int codigo, String cidade, String estadoUF, LocalDate anoModelo, LocalDate anoFabriacao, String tipoVeiculo, 
       String tipoCombustivel, String nome, String nomeProprietario, String fabricante, String modelo, int qtdeMotores, int qtdeOcupantes){
       super(codigo, modelo, cidade, estadoUF, anoModelo, anoFabriacao, tipoVeiculo, tipoCombustivel, nome, nomeProprietario, fabricante, modelo, tipoCombustivel, fabricante, modelo, qtdeOcupantes);
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes= qtdeOcupantes;
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
}
