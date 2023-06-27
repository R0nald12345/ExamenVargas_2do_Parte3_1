/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p1;

/**
 *
 * @author Ronald
 */
public class Main {
    
    public static void main(String[] args) {
        LeerArchivoTexto archivoTxt = new LeerArchivoTexto();
        ListaArreglo_Arbol lisA =  new ListaArreglo_Arbol();
        archivoTxt.leerArchivoTxt("C:\\Users\\USER\\Desktop\\archivoTexto\\prueba.txt",lisA);
        lisA.Mostrar(1);
        
    }
}
