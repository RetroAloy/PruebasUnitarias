package pruebasunitarias2610;

import ico.fes.Aritmetica;

/**
 *
 * @author 52551
 */
public class PruebasUnitarias2610 {

    public static void main(String[] args) {
        Aritmetica calculadora = new Aritmetica();
        calculadora.setA(3);
        calculadora.setB(4);
        System.out.println("La suma es: " + calculadora.sumar());
        System.out.println("La resta es: " + calculadora.restar());
    
    
    }
}
