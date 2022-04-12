package org.utl.examen.core;

/**
 *
 * @author zende
 */
public class OperacionesBasicas {
   public double sumar(double n1, double n2)
   {
       return n1 + n2;
   }
   public double restar(double n1, double n2)
   {
       return n1 - n2;
   }
   public double multiplicar(double n1, double n2)
   {
       return n1 * n2;
   }
   public double dividir(double n1, double n2)
   {
       return  n2 == 0 ? 0 : n1 / n2;
   }
}
