/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.HashMap;

/**
 *
 * @author matheus
 */
public class Calculadora {
    
    private HashMap<Character,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<Character,Integer>();
        mapaNumeros.put('I', 1);
        mapaNumeros.put('V', 5);
        mapaNumeros.put('X', 10);
        mapaNumeros.put('L', 50);
        mapaNumeros.put('C', 100);    
        mapaNumeros.put('D', 500);    
        mapaNumeros.put('M', 1000);      
    }
    
    public int calcular(String numeroRomano){
        
        int tam = numeroRomano.length();
        int decimal = 0;
        int i = 0;
        int romanoProx, romanoAtual;
        int dif;
        
        while(i < tam){
            if(tam == 1){
                decimal = mapaNumeros.get(numeroRomano.charAt(i));
                i++;
            }else{
                romanoAtual = mapaNumeros.get(numeroRomano.charAt(i));
                romanoProx = mapaNumeros.get(numeroRomano.charAt(i+1));
                if(romanoAtual >= romanoProx){
                    decimal += romanoAtual;
                    i++;
                    if(i == (tam-1)){
                        decimal += romanoProx;
                        i = tam;
                    }
                }else{
                    dif = romanoProx - romanoAtual;
                    decimal += dif;
                    i += 2;
                }
            }
        }
    return decimal;
    }
}



