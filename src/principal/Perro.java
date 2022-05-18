package principal;

import java.util.List;

enum Raza{
    raza1, raza2, raza3, raza4
}

public class Perro {

    private int id;
    private String nombre;
    private Raza raza;
    private String color;
    private boolean conChapa;
    private int edad;

    public Perro(int id, String nombre, boolean conChapa, Raza raza, String color, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.conChapa = conChapa;
        this.raza=raza;
        this.color=color;
        this.edad = edad;
    }




    public static void crearPerros(List<Perro> listaPerro){

        listaPerro.add(new Perro(1111, "Miau",false, Raza.raza3, "negro",18));
        listaPerro.add(new Perro(1112, "Perrazo", true, Raza.raza2, "azul", 24));
        listaPerro.add(new Perro(1113, "Yamate", false, Raza.raza1, "rosa", 7));
        listaPerro.add(new Perro(1114, "Onichan",true, Raza.raza4, "rojo", 27));
        listaPerro.add(new Perro(1115, "Okaeri",false, Raza.raza1, "negro", 2));
        listaPerro.add(new Perro(1116, "Naruto",true,  Raza.raza2, "gris",6));

    }


    public static void buscarPerro(){
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {

        StringBuffer sb = new StringBuffer(nombre);
        sb.setLength(10);

        return sb.toString();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public boolean isConChapa() {
        return conChapa;
    }

    public void setConChapa(boolean conChapa) {
        this.conChapa = conChapa;
    }

    public String getColor() {
        StringBuffer sb = new StringBuffer(color);
        sb.setLength(10);

        return sb.toString();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
