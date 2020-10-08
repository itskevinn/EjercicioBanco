package banco;
public class CuentaAhorros extends Cuenta{
    private int NumeroTarjeta = 1234;
    private final long SaldoMaximo = 10000000;
    private int Fecha = 2020;
    Cliente persona = new Cliente();
public CuentaAhorros(long saldo){
    this.saldo = saldo;
}
@Override
    public void consignar(long valor) {
     if((valor+getSaldo())>SaldoMaximo){
         System.out.println("No es valida la transaccion. ERROR: Valor máximo excedido");
     }
     else setSaldo(valor+getSaldo());
     System.out.println("Transaccion correctamente realizada");
       }
    
@Override
    public void retirar(long valor) {
        int cont = 0, imp;
        if(cont>3){
            imp=(int) (valor*0.03);
        if ((getSaldo()-valor-imp)>=getSaldo()){
       saldo = getSaldo()-valor-imp;
    setSaldo(saldo);
    }
        else{ 
            System.out.println("Su saldo es insuficiente");
        }
}
        else 
        {
         if ((getSaldo()-valor)>=getSaldo()){
       saldo =getSaldo()-valor;
      setSaldo(saldo);
      cont++;
    }
        else{ 
            System.out.println("Su saldo es insuficiente");
        }
}
        }
    
        public void consultar(){
        System.out.println("SALDO:  "+getSaldo());
    }   

    /**
     * @return the NumeroTarjeta
     */
    public int getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    /**
     * @param NumeroTarjeta the NumeroTarjeta to set
     */
    public void setNumeroTarjeta(int NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }

    /**
     * @return the Fecha
     */
    public int getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }
}
