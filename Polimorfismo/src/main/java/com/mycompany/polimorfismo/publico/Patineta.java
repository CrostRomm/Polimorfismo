package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá los metodos y variables para una patineta
 */
public class Patineta extends Vehiculo
{
    /**
     * Variable que se usa para guardar el combustible que usa una patineta
     */
    private String combustible;
    /**
     * Constructor de la clase patineta
     * @param combustible
     * @param tamanoRueda 
     */
    public Patineta(String combustible, int tamanoRueda)
    {
        super(tamanoRueda);
        this.combustible = combustible;
    }
    /**
     * Metodo que se usa para definir el tipo de combustible que usa una patineta
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
        System.out.println("Hola soy la clase padre numero #1 impresa desde su hijo la clase Patineta!");
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
