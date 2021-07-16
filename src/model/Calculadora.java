
package model;

import javax.swing.JOptionPane;

public class Calculadora {
    private float num1;
    private float num2;
    private String operacion;

    public Calculadora(float num1, float num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Hola");
    }

    public Calculadora() {
    }
    

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public float Operacion(){
        float resultado =0;
        if(getOperacion().equals("Suma")){
             resultado = getNum1()+getNum2();
        }else if(getOperacion().equals("Resta")){
             resultado = getNum1()-getNum2();
        }else if(getOperacion().equals("Multiplicacion")){
             resultado = getNum1()*getNum2();
        }else{
             resultado = getNum1()/getNum2();
        }
        return resultado;
    }
    
    
    
    
}
