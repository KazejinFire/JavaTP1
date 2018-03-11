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
public class Porta {
    boolean isOpen = false;
    int numAberturas,count;
    
    void abrir()
    {
        if(!isOpen)
        {
            isOpen = true;
            count++;
        }
        else
            System.out.println("Porta ja estava aberta");
    }
    
    void fechar()
    {
        if(isOpen)
        {
            isOpen = false;
        }
        else
            System.out.println("Porta ja estava fechada");
    }
}
