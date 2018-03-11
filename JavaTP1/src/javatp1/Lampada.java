package javatp1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wendel
 */
public class Lampada {
    boolean on, queimada;
    int vidaUtil = 10;
    
    void click()
    {
        if(!queimada)
        {
        setEstado();
        setVidaUtil();
        }
        if(vidaUtil== 0)
        {
            
            System.out.println("Lampada queimou");
        }
    }
    
    void setVidaUtil()
    {
        vidaUtil--;
    }
    
    void setEstado()
    {
        if(queimada)
        {
            System.out.println("Lampada queimada");
        }
        else
        {
        if(on)
            on = false;
        else
            on = true;
        }
    }
    
    boolean getEstado()
    {
        return on;
    }
}
