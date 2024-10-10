/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica1evaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class Práctica1Evaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // crear variables
        int empleados = 0;
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        double salarioSemanal = 0;
        double SEM = 0 ;
        double IVM = 0 ;
        double pago = 0 ;
        String mostrarResultado = "";   
        
        //crear for para la cantidad de emepleados
        for (int i = 0; i < empleados ; i++) {
        salarioSemanal= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de su salario"));
        SEM = (salarioSemanal * 0.0925) ;
        IVM = (salarioSemanal * 0.0508) ; 
        pago = (SEM + IVM) ;
        }
        
        //mostrar resultado 
        JOptionPane.showMessageDialog(null, mostrarResultado + " Deberá pagar por SEM " + SEM + "\n"+ " Deberá pagar por IVM " + IVM +"\n"+   " La empresa deberá abonar a la CCSS el monto de  " + pago + " por concepto de SEM y IVM");
        
        }

  
    }
    

