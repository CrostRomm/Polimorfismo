package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá los metodos y variables para un avion
 */
public class Avion extends Motorizado
{
    /**
     * Variable que se usa para guardar la velocidad de un avion
     */
    private double velocidad;
    /**
     * constructor de la clase avion
     * @param velocidad
     * @param combustible
     * @param tamanoRueda 
     */
    public Avion(double velocidad, String combustible, int tamanoRueda)
    {
        super(combustible, tamanoRueda);
        this.velocidad = velocidad;
    }
    /**
     * Metodo que define la velocidad de un avion
     */
    public void defineVelocidad()
    {
        System.out.println((new StringBuilder()).append("La velocidad del avion es de: ").append(velocidad).append("").toString());
    }
    /**
     * Sobreescribe el metodo mensajePadre1 de su antepadre la clase Vehiculo
     */
    @Override
    public void mensajePadre1()
    {
        System.out.println("Hola soy la clase padre numero #1 impresa desde su hijo la clase Avion!");
    }
    /**
     * Sobreescribe el metodo tipoCombustible de su padre la clase Motorizado
     */
    @Override
    public void tipoCombustible()
    {
        String combus = "Hidrogeno";
        Motorizado motores = new Motorizado(combus, 1);
        System.out.println((new StringBuilder()).append("Los aviones solo usan de combustible: ").append(motores.getCombustible()).append("").toString());
    }
    /**
     * Get de la variable velocidad
     * @return double
     */
    public double getVelocidad()
    {
        return velocidad;
    }
    /**
     * Set de la variable velocidad
     * @param velocidad 
     */
    public void setVelocidad(double velocidad)
    {
        this.velocidad = velocidad;
    }
}
