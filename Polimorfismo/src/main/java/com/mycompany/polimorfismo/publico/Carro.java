package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá los metodos y variables para un carro
 */
public class Carro extends Motorizado
{
    /**
     * Variable que se usa para guardar la velocidad de un carro
     */
    private int velocidad;
    /**
     * Constructor de la clase carro
     * @param velocidad
     * @param combustible
     * @param tamanoRueda 
     */
    public Carro(int velocidad, String combustible, int tamanoRueda)
    {
        super(combustible, tamanoRueda);
        this.velocidad = velocidad;
    }
    /**
     * Metodo que define la velocidad de un carro
     */
    public void defineVelocidad()
    {
        System.out.println((new StringBuilder()).append("La velocidad del carro es de: ").append(velocidad).append("").toString());
    }
    /**
     * Sobreescribe el metodo mensajePadre1 de su antepadre la clase Vehiculo
     */
    @Override
    public void mensajePadre1()
    {
        System.out.println("Hola soy la clase padre numero #1 impresa desde su hijo la clase Carro!");
    }
    /**
     * Get de la variable velocidad
     * @return int
     */
    public int getVelocidad()
    {
        return velocidad;
    }
    /**
     * Set de la variable velocidad
     * @param velocidad 
     */
    public void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;
    }
}
