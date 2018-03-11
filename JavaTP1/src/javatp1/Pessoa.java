/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp1;

/**
 *
 * @author Wendel
 */
public class Pessoa {
    String nome,sexo;
    int idade;
    boolean vegetariana;
    
    Pessoa(String n, String s, int i, boolean v )
    {
        nome = n;
        sexo = s;
        idade = i;
        vegetariana = v; 
    }
}
