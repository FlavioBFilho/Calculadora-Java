/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.controllers;

/**
 *
 * @author usuario
 */
public class CalculadoraController {
    private double a;
    private double b;
    private double res;
    private char op;


    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }
    

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    
    public double adicionar(){
        return this.a+this.b;
    }
    
    public double subtrair(){
        return this.a-this.b;
    }
    
    public double dividir(){
        return this.a/this.b;
    }
    
    public double multiplicar(){
        return this.a*this.b;
    }
    
    public void igual(){
        
        switch(this.op){
            case '+':
                this.setRes(this.adicionar());
                break;
            case '-':
                this.setRes(this.subtrair());
                break;
            case '*':
                this.setRes(this.multiplicar());
                break;
            case '/':
                this.setRes(this.dividir());
                break;
        }
      
    }
}
