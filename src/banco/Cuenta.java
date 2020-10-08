package banco;
public abstract class Cuenta {
    public long saldo=0;
    public abstract void consignar(long valor);
    public abstract void retirar(long valor);
    public abstract void consultar();
     protected void setSaldo(long saldo){
        this.saldo = saldo;
    }
    protected long getSaldo(){
        return saldo;
    }
}
