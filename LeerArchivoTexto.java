/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author USER
 */
public class LeerArchivoTexto {
      private String texto;
      public FileReader archivoCargado;

    public LeerArchivoTexto() {
        this.texto = "";
        archivoCargado = null;
    }

    public void dividirTokens() {
        StringTokenizer tokenizer = new StringTokenizer(texto, ",. ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
    
    
    public void leerArchivoTxt(String ubicacionTxt,ListaArreglo_Arbol lA ){
        FileReader archivo;
        BufferedReader lector;
        try {
            archivoCargado = new FileReader(ubicacionTxt);
            if (archivoCargado.ready()) {
                lector = new BufferedReader(archivoCargado);
                while ((texto = lector.readLine()) != null) {

                  // Crear un objeto StringTokenizer con el delimitador ","
                    StringTokenizer tokenizer1 = new StringTokenizer(texto, ",.;: ");
                    
                    
                    // Iterar a través de los tokens y mostrarlos
                    while (tokenizer1.hasMoreTokens() ) {
                        String token = tokenizer1.nextToken();
                        
                        //Carga la palabra en el respectiva posicion del Arrreglo del Arbol..
                        lA.CargarPalabra(token);  
             
                        //System.out.println(token);
                        
                    }
//                    System.out.println(cadena);
                }
            } else {
                System.out.println("El archivo no esta listo para ser leido....");
            }
        } catch (Exception e) {
            System.out.println("Error...");
        }
    }

    

}
