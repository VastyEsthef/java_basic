package edu.pe.example;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Practice {
    public static void main(String[] args) {

        /*
        MAP
        - Colección de pares clave-valor, cada clave asocia a un único valor
        - No permite claves duplicadas
        - Permite acceso rápido a los valores
        - Java proporciona implementaciones de Map:
            + HasMap
            + TreeMap
            + LinkedHashMap
        */
        /*
        MÉTODOS PRINCIPALES:
        - put(clave, Valor)
        - get(clave)  -> Devuelve el valor asociado a la clave, si no existe devuelve null.
        - remove(clave) -> Si no existe clave, no hace la operacion (evita que se caiga el programa)
        - keySet()  -> Devuelve todas las claves en el Map
        - values()  -> Devuelve todos los valores que contine el Map
        - containsKey(Object clave)  -> Comprueba si el Map contiene la clave especificada
        - containsValue(Object valor)  -> Comprueba si el Map contiene el valor especificado
        */

        //---------------------- Ejemplo ----------------------

        Map<Integer, String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(100, "Vasty");
        mapaEmpleados.put(101, "Fernando");
        mapaEmpleados.put(102, "Elena");
        mapaEmpleados.put(103, "Italo");
        
        boolean empleadoEstaEnLista = mapaEmpleados.containsValue("Elena");

        if (empleadoEstaEnLista == true) {
            System.out.println("El empleado sí está");
        } else {
            System.out.println("El empleado no está");
        }

        System.out.println("lista de Empleados: "+ mapaEmpleados.values());
        System.out.println("lista de Empleados (id): "+ mapaEmpleados.keySet());
        System.out.println("Empleado con id = 100: "+ mapaEmpleados.get(100));

        mapaEmpleados.remove(103);
        System.out.println("Nueva lista de Empleados: "+ mapaEmpleados.values());

        // --------------------- CON OBJETOS ------------------------
        System.out.println("------------------ Objetos -----------------------");

        Map<Integer, Empleado> empleados = new HashMap<>();

        // Agregar personas al HashMap
        empleados.put(1, new Empleado(10, "Vasty", "Claro"));
        empleados.put(2, new Empleado(11, "Williams", "Huawey"));
        empleados.put(3, new Empleado(12, "Esthefany", "NTT DATA"));

        System.out.println(empleados); // {1=10 - Vasty - Claro, 2=11 - Williams - Huawey, 3=12 - Esthefany - NTT DATA}

        // Obtener un objeto Persona por su clave
        System.out.println("Empleado con clave 12: " + empleados.get(2).getName());

        // Recorrer el HashMap
        for (Integer clave : empleados.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + empleados.get(clave)); //Clave: 1, Valor: edu.pe.example.Empleado@378bf509
        }

    }
}

class Empleado {
    String name;
    String companyName;
    int id;

    // CONSTRUCTOR
    public Empleado(int id, String name, String companyName) {
        this.name = name;
        this.id = id;
        this.companyName = companyName;
    }

    // Permite definir cómo se muestra cuando se llama a un objeto
    @Override
    public String toString() {
        return id + " - " + name + " - " + companyName;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
