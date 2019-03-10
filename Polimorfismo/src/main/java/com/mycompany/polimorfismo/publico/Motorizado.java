package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá los metodos y variables para un vehiculo motorizado
 */
public class Motorizado extends Vehiculo
{
    /**
     * Variable que va a guardar el tipo de combustible de un vehiculo motorizado
     */
    private String combustible;
    /**
     * Constructor de la clase motorizado
     * @param combustible
     * @param tamanoRueda 
     */
    public Motorizado(String combustible, int tamanoRueda)
    {
        super(tamanoRueda);
        this.combustible = combustible;
    }
    /**
     * Metodo que define el tipo de combustible de un motorizado
     */
    public void tipoCombustible()
    {
        System.out.println((new StringBuilder()).append("El tipo de combustible es:  ").append(combustible).append("").toString());
    }
    /**
     * Sobreescribe el metodo mensajePadre1 de su padre la clase Vehiculo
     */
    public void mensajePadre1()
    {
        System.out.println("Hola soy la clase padre numero #1 impresa desde su hijo la clase Motorizado!");
    }
    /**
     * Get de la variable combustible
     * @return String
     */
    public String getCombustible()
    {
        return combustible;
    }
    /**
     * Set de la variable combustible
     * @param combustible 
     */
    public void setCombustible(String combustible)
    {
        this.combustible = combustible;
    }
}
