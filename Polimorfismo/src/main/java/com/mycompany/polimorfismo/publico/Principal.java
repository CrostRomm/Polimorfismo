package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase contendrá el metodo de ejecucuion principal que hará llamado a otros metodos en otra clase
 */
public class Principal
{
    /**
     * Constructor de la clase Principal
     */
    public Principal()
    {
    }
    /**
     * Metodo principal de la aplicacion
     * @param args 
     */
    public static void main(String args[])
    {
        Operacion op = new Operacion();
        op.llamaHijos2();
        op.llamaHijos1();
        op.padre();
    }
}
