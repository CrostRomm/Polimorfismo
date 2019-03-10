package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase es la clase padre y contendrá metodos para heredar
 */
public class Vehiculo implements IColor{
    /**
     * Variable que guardará el tamaño de rueda de los vehiculos
     */
    private int tamanoRueda;
    /**
     * Constructor de la clase padre Vehiculo
     * @param tamanoRueda 
     */
    public Vehiculo(int tamanoRueda)
    {
        this.tamanoRueda = tamanoRueda;
    }
    /**
     * Metodo que imprime un mensaje de la clase padre
     */
    public void mensajePadre1()
    {
        System.out.println("Hola soy la clase padre numero #1!");
    }
    /**
     * Metodo que se hereda de la interface y define un color
     */
    @Override
    public void defineColor()
    {
        String abecedario[] = {
            "Rojo", "Verde", "Amarillo", "Azul", "Cafe", "Naranja", "Morado", "Rosado", "Lila"
        };
        int numRandon = (int)Math.round(Math.random() * 8D);
        System.out.println((new StringBuilder()).append("El color es: ").append(abecedario[numRandon]).append("").toString());
    }
    /**
     * Metodo que se hereda de la interface y define una letra
     */
    @Override
    public void defineLetra()
    {
        String abecedario[] = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
            "U", "V", "W", "X", "Y", "Z"
        };
        int numRandon = (int)Math.round(Math.random() * 25D);
        System.out.println((new StringBuilder()).append("La letra es: ").append(abecedario[numRandon]).append("").toString());
    }
    /**
     * Get de la variable tamaño de la rueda
     * @return int
     */
    public int getTamanoRueda()
    {
        return tamanoRueda;
    }
    /**
     * Set de la variable tamaño de la rueda
     * @param tamanoRueda 
     */
    public void setTamanoRueda(int tamanoRueda)
    {
        this.tamanoRueda = tamanoRueda;
    }
}
