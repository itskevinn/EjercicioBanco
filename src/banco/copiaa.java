private static Cuenta crearPersona(){
    int opci;
    String nombre;
    int id;
    long valor;
    Scanner leer = new Scanner(System.in);
           do{
           System.out.println("1. Cuenta Corriente");
           System.out.println("2. Cuenta de Ahorros");
           System.out.println("3. Salir");
           opci = leer.nextInt();
       }
       while((opci<1) && (opci>2));
           switch(opci){
               case 1: cuenta = new CuentaCorriente();
               persona.setCuenta(cuenta);   
                              long saldo;
                   System.out.println("Saldo incial:    ");
                   persona.getCuenta().setSaldo(saldo=leer.nextLong());
               int opc; 
               do{
        System.out.println("MENU");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Ver saldo");
  opc=leer.nextInt();      
}
while((opc>3) && (opc<1));
    switch(opc){
        case 1: System.out.println("INGRESE EL VALOR A CONSIGNAR:   ");
        valor = leer.nextLong(); 
        persona.getCuenta().consignar(valor);
        break;
        case 2: System.out.println("INGRESE EL VALOR A RETIRAR:   ");
        valor = leer.nextLong(); 
        persona.getCuenta().retirar(valor);
        break;
        case 3: cuenta.consultar(); break;
    }   break;
                 case 2: 
                     System.out.println("Saldo incial:    ");
                   persona.getCuenta().setSaldo(saldo=leer.nextLong());
                   cuenta = new CuentaAhorros(saldo);
                 persona.setCuenta(cuenta);
                 do{
        System.out.println("MENU");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Ver saldo");
  opc=leer.nextInt();      
}
while((opc>3) && (opc<1));
    switch(opc){
        case 1: System.out.println("INGRESE EL VALOR A CONSIGNAR:   ");
        valor = leer.nextLong();
        persona.getCuenta().consignar(valor);
        case 2: System.out.println("INGRESE EL VALOR A RETIRAR:   ");
        valor = leer.nextLong();
        cuenta.retirar(valor);
        case 3: cuenta.consultar();
               break;
           }
    }   
   return cuenta;
    }
  }/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author keiinerp
 */
public class copiaa {
    
}
