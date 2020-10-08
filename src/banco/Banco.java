
package banco;

import java.util.Scanner;
import java.io.*;

public class Banco {
    public static void main(String[] args) {
        System.out.println("CREAR CUENTA");
    crearPersona();
}
        
    public static void crearPersona(){
        Cuenta cuenta = null;
        Scanner leer = new Scanner(System.in);
        String nombre;
        long saldo, valor;
        int id, opc, op = 0;
        String opci="s";
        System.out.println("Nombre: "); 
        nombre = leer.nextLine();
        System.out.println("Id: ");
        id = leer.nextInt();
        System.out.println("Tipo de cuenta: 1. Ahorros, 2. Corriente");
        opc=leer.nextInt();
        if(opc==1){
            saldo=leer.nextLong();
            cuenta = new CuentaAhorros(saldo);
            while("s".equals(opci)){
            do{
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            op = leer.nextInt();
        }
            while(op>3 && 1>op);
            switch(op){
            case 1: System.out.println("Ingrese el valor a consignar en la cuenta de :   "+nombre); valor = leer.nextLong();
            cuenta.consignar(valor);break;
            case 2: System.out.println("Ingrese el valor a retirar en la cuenta de : "+nombre); valor = leer.nextLong();
            cuenta.retirar(valor); break;
            case 3: System.out.println("Saldo en la cuenta de  "+nombre+"es:   "+cuenta.getSaldo());
            case 4:op='n';
        }
    }
                    do{
                System.out.println("desea continuar");
                opci=leer.nextLine();
            }
            while(!"n".equals(opci) && !"s".equals(opci));
    }
        else{
            long saldoMinimo;
            saldo=leer.nextLong();
            System.out.println("Ingrese el saldo minimo de la cuenta:  ");
            saldoMinimo = leer.nextLong();
            cuenta = new CuentaCorriente(saldo, saldoMinimo);
            while("s".equals(opci)){
            do{
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            op = leer.nextInt();
        }
            while(op>3 && 1>op);
            switch(op){
            case 1: System.out.println("Ingrese el valor a consignar en la cuenta de :   "+nombre); valor = leer.nextLong();
            cuenta.consignar(valor);break;
            case 2: System.out.println("Ingrese el valor a retirar en la cuenta de : "+nombre); valor = leer.nextLong();
            cuenta.retirar(valor); break;
            case 3: System.out.println("Saldo en la cuenta de  "+nombre+"es:   "+cuenta.getSaldo());
            case 4:op='n';
        }
    }
                    do{
                System.out.println("desea continuar");
                opci=leer.nextLine();
            }
            while(!"n".equals(opci) && !"s".equals(opci));
        }
    }   
    }