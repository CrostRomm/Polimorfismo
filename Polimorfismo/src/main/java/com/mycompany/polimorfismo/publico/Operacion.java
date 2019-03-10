package com.mycompany.polimorfismo.publico;
/**
 * @author Cristian Romero
 * @version 1.0
 * Esta clase se usa para crear los diferentes vehiculos y poder imprimir 
 * los metodos de las diferentes clases
 */
public class Operacion
{
    /**
     * Constructor de la clase Operacion
     */
    public Operacion()
    {
    }
    /**
     * Metodo que crea carros y aviones e imprime sus diferentes metodos propios y heredados
     */
    public void llamaHijos2()
    {
        Carro c1 = new Carro(700, "Gasolina", 12);
        Carro c2 = new Carro(500, "Gasolina", 7);
        Carro c3 = new Carro(450, "Gasolina", 7);
        Avion a1 = new Avion(800D, "Hidrogeno", 300);
        Avion a2 = new Avion(3000D, "Hidrogeno", 250);
        Avion a3 = new Avion(2300D, "Hidrogeno", 230);
        Motorizado motorLista[] = {
            c1, c2, c3, a1, a2, a3
        };
        Motorizado amotorizado[] = motorLista;
        int i = amotorizado.length;
        for(int j = 0; j < i; j++)
        {
            Motorizado m = amotorizado[j];
            if(m instanceof Carro)
            {
                System.out.println("          CARRO: HIJA CON HERENCIA DE MOTORIZADO A SU VEZ HIJA DE VEHICULO");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println((new StringBuilder()).append("COMBUSTIBLE: ").append(((Carro)m).getCombustible()).append("  TAMA\321O RUEDA: ").append(((Carro)m).getTamanoRueda()).append(" VELOCIDAD: ").append(((Carro)m).getVelocidad()).toString());
                ((Carro)m).mensajePadre1();
                ((Carro)m).tipoCombustible();
                ((Carro)m).defineColor();
                ((Carro)m).defineLetra();
            }
            if(m instanceof Avion)
            {
                System.out.println("          AVION: HIJA CON HERENCIA DE MOTORIZADO A SU VEZ HIJA DE VEHICULO");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println((new StringBuilder()).append("COMBUSTIBLE: ").append(((Avion)m).getCombustible()).append("  TAMA\321O RUEDA: ").append(((Avion)m).getTamanoRueda()).append(" VELOCIDAD: ").append(((Avion)m).getVelocidad()).toString());
                ((Avion)m).mensajePadre1();
                ((Avion)m).tipoCombustible();
                ((Avion)m).defineColor();
                ((Avion)m).defineLetra();
            }
        }

    }
    /**
     * Metodo que crea ciclas, patinetas y vehiculos motorizados
     * también imprime sus metodos propios y los heredados
     */
    public void llamaHijos1()
    {
        Cicla cc1 = new Cicla("Pedalear", 3);
        Cicla cc2 = new Cicla("Pedalear", 4);
        Cicla cc3 = new Cicla("Pedalear", 5);
        Patineta p1 = new Patineta("Patinar", 1);
        Patineta p2 = new Patineta("Patinar", 2);
        Motorizado m1 = new Motorizado("Quimico", 6);
        Motorizado m2 = new Motorizado("Quimico", 7);
        Vehiculo vehiculoLista[] = {
            cc1, cc2, cc3, p1, p2, m1, m2
        };
        Vehiculo avehiculo[] = vehiculoLista;
        int i = avehiculo.length;
        for(int j = 0; j < i; j++)
        {
            Vehiculo v = avehiculo[j];
            if(v instanceof Cicla)
            {
                System.out.println("          CICLA: HIJA CON HERENCIA DE VEHICULO");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println((new StringBuilder()).append("COMBUSTIBLE: ").append(((Cicla)v).getCombustible()).append("  TAMA\321O RUEDA: ").append(((Cicla)v).getTamanoRueda()).toString());
                ((Cicla)v).mensajePadre1();
                ((Cicla)v).defineColor();
                ((Cicla)v).defineLetra();
            }
            if(v instanceof Patineta)
            {
                System.out.println("          PATINETA: HIJA CON HERENCIA DE VEHICULO");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println((new StringBuilder()).append("COMBUSTIBLE: ").append(((Patineta)v).getCombustible()).append("  TAMA\321O RUEDA: ").append(((Patineta)v).getTamanoRueda()).toString());
                ((Patineta) v).mensajePadre1();
                ((Patineta) v).tipoCombustible();
                ((Patineta) v).defineColor();
                ((Patineta) v).defineLetra();
            }
            if(v instanceof Motorizado)
            {
                System.out.println("          MOTORIZADO: HIJA CON HERENCIA DE VEHICULO");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println((new StringBuilder()).append("COMBUSTIBLE: ").append(((Motorizado)v).getCombustible()).append("  TAMA\321O RUEDA: ").append(((Motorizado)v).getTamanoRueda()).toString());
                ((Motorizado)v).mensajePadre1();
                ((Motorizado)v).defineColor();
                ((Motorizado)v).defineLetra();
            }
        }

    }
    /**
     * Metodo que imprime unicamente los metodos de la clase padre
     */
    public void padre()
    {
        Vehiculo v1 = new Vehiculo(12);
        System.out.println("          PADRE SIN ATRIBUTOS DE LAS HIJAS");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println((new StringBuilder()).append("TAMAÑO RUEDA: ").append(v1.getTamanoRueda()).toString());
        v1.mensajePadre1();
        v1.defineColor();
        v1.defineLetra();
    }
}
