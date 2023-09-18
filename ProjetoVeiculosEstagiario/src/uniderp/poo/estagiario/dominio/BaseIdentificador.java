package uniderp.poo.estagiario.dominio;

public abstract class BaseIdentificador {
    protected int codigo;
    protected String codigoRenavam;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    
    public BaseIdentificador(int codigo, String codigoRenavam){
        this.codigo = codigo;
        this.codigoRenavam = codigoRenavam;
    }
}

