/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Wendel
 */
public class Equilatero {
    double lado, per,area;
    
    Equilatero(double lado)
    {
        this.lado = lado;
    }
    
    void calcArea()
    {
        area = lado * sqrt(3)/2;
    }
    
    void calcPerimetro()
    {
        per = 3*lado;
    }
    
    double getArea()
    {
       return area; 
    }
    
    double getPerimetro()
    {
        return per;
    }
}
