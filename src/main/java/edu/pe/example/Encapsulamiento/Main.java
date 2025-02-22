package edu.pe.example.Encapsulamiento;

/*
Encapsulamiento:
- Agrupa elementos comunes entre sí, los encapsula para ser utilizados cuando sea necesario.
- Tiene 3 niveles de acceso

    public: Atributo o metodo que puede ser utilizado desde cualquier clase
    private: Atributo o metodo que puede ser utilizado unicamente dentro de la clase donde está declarado.
    protected:Atributo o metodo que puede ser utilizado dentro de la clase donde está declarado y dentro
        de las clases hijas si se estuviera usando herencia.

Ocultación:
- Aislar elementos
- Permite una comunicación limitada por medio de una interfaz.

*/

public class Main {
    public static void main(String[] args) {

    Product p1 = new Product();
    Product p2 = new Product("Leche", 5.5, 123);

    System.out.println("Product:" + p2.getName() + " S/." + p2.getPrice());

    p2.setName("Arroz");
    p2.setPrice(7.1);

    System.out.println("Product:" + p2.getName() + " S/." + p2.getPrice());

    }
}
