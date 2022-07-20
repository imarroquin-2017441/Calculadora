package org.ihanmarroquin.system;

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.ihanmarroquin.bean.Division;
import org.ihanmarroquin.bean.Multiplicacion;
import org.ihanmarroquin.bean.Resta;
import org.ihanmarroquin.bean.Salida;
import org.ihanmarroquin.bean.Suma;

/*
    Programador: Ihan Gilberto Alexander Marroquin Sequen
    Carne: 2017441
    Codigo Academico: IN5AM
    Creacion: 08/04/2021
        Suma: 14/04/2021
        Resta: 14/04/2021
        Multiplicacion: 14/04/2021
        Division: 14/04/2021
    Operaciones:
        sumas: 14/04/2021
        restas: 14/04/2021
        multiplicaciones: 14/04/2021
        divisiones: 14/04/2021
*/
public class Principal {


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Programador: \n"
                            + "Ihan Marroquin");
         int op;
         Salida sal = new Salida();
        do{
        Suma suma = new Suma(0,0);
        Resta resta = new Resta(0,0);
        Multiplicacion multi = new Multiplicacion(0,0);
        Division divi = new Division(0,0);
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de la calculadora \n"
                + "1. Suma \n"
                + "2. Resta \n"
                + "3. Multiplicaion \n"
                + "4. Division \n"
                + "5. Salir \n"
                + "Ingrese un numero de opcion"));

        switch (op){
            case 1:{
                suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor")));
                suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null,"La suma es " + String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
            }
            break;
            case 2:{
                resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La resta es " + String.valueOf(resta.sustraccion(resta.getNum1(), resta.getNum2())));
            }
            break;
            case 3:{
                multi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                multi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La multiplicacion es " + String.valueOf(multi.multiplicacion(multi.getNum1(), multi.getNum2())));
            }
            break;
            case 4:{
                divi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                divi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La divion es " + String.valueOf(divi.dividir(divi.getNum1(), divi.getNum2())));
            }
            break;
            case 5:{
                JOptionPane.showMessageDialog(null, "Gracias por probar");
                sal.salir();
            }
        }
        }while(op > 1 & op < 6);
                JOptionPane.showMessageDialog(null, "Gracias por probar \n (Esos numero no eran >:c)");
                sal.salir();
    }
    
}
