
package banco;
public class CuentaCorriente extends Cuenta{
    private int NumChequera;
    private final long SaldoMinimo;

    CuentaCorriente(long saldo, long saldoMinimo) {
       this.saldo = saldo;
       this.SaldoMinimo=saldoMinimo;
    }
    @Override
    public void consignar(long valor) {
       if ((valor+getSaldo())>SaldoMinimo){
           System.out.println("Debe consignar más dinero... SALDO:  "+getSaldo());
       }
       else valor=valor+getSaldo();
       setSaldo(valor);
    }

    @Override
    public void retirar(long valor) {
               int cont = 0, imp;
        if(cont>4){
            imp=(int) (valor*0.03);
        if ((getSaldo()-valor-imp)>=SaldoMinimo){
       saldo = getSaldo()-valor-imp;
    setSaldo(saldo);
    }
        else{ 
            System.out.println("Su saldo es insuficiente");
        }
}
        else 
        {
         if ((getSaldo()-valor)>=SaldoMinimo){
       saldo =getSaldo()-valor;
      setSaldo(saldo);
      cont++;
    }
        else{ 
            System.out.println("Su saldo es insuficiente");
        }
}
        }

    @Override
    public void consultar() {
        System.out.println("SALDO:  "+getSaldo());
    }
    
}
