/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTP1;

import static java.lang.Math.*;
/**
 *
 * @author Wendel
 */
public class Eq2Grau {
    double a,b,c,delta,raiz1,raiz2;
    
    double delta(double a, double b, double c)
    {
        delta = pow(b,2)-4*a*c;
        return delta;
    }
    
    String raiz1()
    {
       if(delta <0)
       {
           return "NaN";
       }
       else
       {
           raiz1 =(-b + sqrt(delta))/2*a;
           return Double.toString(raiz1);
       }
    }
    
    String raiz2()
    {
        if(delta <0)
       {
           return "NaN";
       }
       else
       {
        raiz2 =(-b - sqrt(delta))/2*a;
        return Double.toString(raiz2);
       }
    }
}
