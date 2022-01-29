/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

/**
 *
 * @author morozco
 */
public class FirstArray {
     //tipo_dato   nombre_array[];
    //nombre_array = new tipo_dato[tamaño];
    
    private int arrayInt[];
    private int arrayIntTwo[] = new int[3];
    private char arrayChar[] = {'a','b','c'};
    private char arrayCharTwo[];
    private double arrayDouble[] = new double[5];
    
    
    public FirstArray(){
        this.arrayInt = new int[5];
        this.arrayCharTwo = new char[3];
        this.arrayCharTwo[0] = 'a';
        this.arrayCharTwo[1] = 'b';
        this.arrayCharTwo[2] = 'c';
        this.arrayDouble[0] = 1.5;
        this.arrayDouble[1] = 2.2;       
    }

    public int[] getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(int[] arrayInt) {
        this.arrayInt = arrayInt;
    }

    public int[] getArrayIntTwo() {
        return arrayIntTwo;
    }

    public void setArrayIntTwo(int[] arrayIntTwo) {
        this.arrayIntTwo = arrayIntTwo;
    }

    public char[] getArrayChar() {
        return arrayChar;
    }

    public void setArrayChar(char[] arrayChar) {
        this.arrayChar = arrayChar;
    }

    public char[] getArrayCharTwo() {
        return arrayCharTwo;
    }

    public void setArrayCharTwo(char[] arrayCharTwo) {
        this.arrayCharTwo = arrayCharTwo;
    }

    public double[] getArrayDouble() {
        return arrayDouble;
    }

    public void setArrayDouble(double[] arrayDouble) {
        this.arrayDouble = arrayDouble;
    }
    
    
    
    public void print(){
        for(int x = 0; x < this.arrayCharTwo.length ; x++){
            System.out.println(x + "->" + this.arrayCharTwo[x]);
        }
    }
}
