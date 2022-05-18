package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import static principal.Perro.crearPerros;

public class Main {

    public static void main(String[] args)  {
	// write your code here
        RandomAccessFile ra=null;
        List<Perro> listaPerros = new ArrayList<>();

        crearPerros(listaPerros);

        try{

            ra = new RandomAccessFile("LosPerros.dat", "rw");

            for (Perro pe : listaPerros){

                ra.writeInt(pe.getId());
                ra.writeChars(pe.getNombre());
                ra.writeBoolean(pe.isConChapa());

                StringBuffer sbRaza = new StringBuffer(String.valueOf(pe.getRaza()));
                sbRaza.setLength(10);

                ra.writeChars(sbRaza.toString());
                ra.writeChars(pe.getColor());
                ra.writeInt(pe.getEdad());

            }

            ra.seek(138);

            // Escribir id
            System.out.println(ra.readInt());


            // Escribir nombre
            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += ra.readChar();
            }

            System.out.println(nombre);


            // Escribir con chapa
            System.out.println(ra.readBoolean());

            // Escribir raza
            String raza = "";
            for (int i = 0; i < 10; i++) {
                raza += ra.readChar();
            }
            System.out.println(raza);

            // Escribir color
            String color = "";
            for (int i = 0; i < 10; i++) {
                color += ra.readChar();
            }

            System.out.println(color);

            // Escribir edad
            System.out.println(ra.readInt());


        }catch (FileNotFoundException fe){

            System.out.println("Error");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                ra.close();

            }catch (IOException e){

            }

        }





    }

}
