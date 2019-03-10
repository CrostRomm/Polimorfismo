package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá los metodos y variables para una cicla
 */
public class Cicla extends Vehiculo
{
    /**
     * Variable que se usa para guardar el tipo de combustible que usa una cicla
     */
    private String combustible;
    /**
     * Constructor de la clase Cicla
     * @param combustible
     * @param tamanoRueda 
     */
    public Cicla(String combustible, int tamanoRueda)
    {
        super(tamanoRueda);
        this.combustible = combustible;
    }
    /**
     * Metodo que define el tipo de combustible que usa una cicla
     */
    public void tipoCombustible()
    {
        System.out.println((new StringBuilder()).append("El tipo de combustible es:  ").append(combustible).append("").toString());
    }
    /**
     * Sobreescribe el metodo mensajePadre1 de su padre la clase Vehiculo
     */
    @Override
    public void mensajePadre1()
    {
        System.out.println("Hola soy la clase padre numero #1 impresa desde su hijo la clase Cicla!");
    }
    /**
     * Get de la varaible combustible
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
