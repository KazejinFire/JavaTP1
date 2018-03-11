/*
 * metodo verificarconsumo:  Recebe via parametro uma pessoa, e com isto define
 * a consumação media d carne, pessoas de 0 a 3 anos nao consomem, vegetarianos
 * tambem nao Pessoas de 4 a 12 anos consomem e kg de carne e de 13 anos em
 * diante 2 kgs
 */
package javatp1;

/**
 *
 * @author Wendel
 */
public class Churrasco {

    
    double qtdCarne = 0;
   
    public void verificaConsumo(Pessoa p)
    {
        double temp;
        
        if(p.idade < 4 || p.vegetariana)
        {
            temp = 0;
        }
        else
        {
            if(p.idade <13)
            {
                temp = 1;
            }
            else
            {
                temp = 2;
            }
        }
        
        setQtdCarne( getQtdCarne() +temp);
    }
    
    public double getQtdCarne()
    {
        return qtdCarne;
    }
    
    void setQtdCarne(double qtdCarne)
    {
        this.qtdCarne = qtdCarne;
    }
}
