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
public class Complexo {
    double a,b;
    Complexo(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    
    double soma(Complexo c)
    {
        double s1,s2;
        s1 = this.a + c.a;
        s2 = this.b + c.b;
        return s1;
    }
}
