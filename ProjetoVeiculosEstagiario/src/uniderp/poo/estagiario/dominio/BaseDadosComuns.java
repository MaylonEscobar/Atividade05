package uniderp.poo.estagiario.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador {
    protected String cidade;
    protected String estadoUF;
    protected LocalDate anoModelo;
    protected LocalDate anoFabricação;
    protected String tipoCombustivel;

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public LocalDate getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(LocalDate anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {

        this.tipoCombustivel = tipoCombustivel;
    }
    public BaseDadosComuns(int codigo, String codigoRenavam, String cidade, String estadoUF, LocalDate anoModelo,
        LocalDate anoFabriacao, String tipoCombustivel){
        super(codigo, codigoRenavam);
        this.cidade = cidade;  
        this.estadoUF = estadoUF;
        this.anoModelo = anoModelo;
        this.anoFabricação = anoFabriacao;
        this.tipoCombustivel = tipoCombustivel;
    } 
}

