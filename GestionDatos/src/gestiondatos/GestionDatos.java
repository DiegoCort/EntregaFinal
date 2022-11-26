
package gestiondatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionDatos {
   public void ingresar(String cadena) throws IOException{
       try{
           FileWriter archivo = new FileWriter("Datos.txt", true);
           try(BufferedWriter almacen = new BufferedWriter(archivo)){
               almacen.write(cadena+ "\n");
               almacen.close();
           } 
           archivo.close();
       }catch(Exception ex){}
    }
   
   public ArrayList<String> leer(){     
       ArrayList<String> datos = new ArrayList<>();
       try{
           FileReader archivo = new FileReader("Datos.txt");
           BufferedReader lectura = new BufferedReader(archivo);
           String cadena;
           while((cadena = lectura.readLine()) != null){
               datos.add(cadena);
           }
       }catch(Exception ex){}
       return datos;
   }
   
   public void escribir(String cadena) throws IOException{
       try{
           FileWriter escribir = new FileWriter("Datos.txt", true);
           escribir.write(cadena);
           escribir.close();
       }catch(Exception ex){}
       
   }
   
   public void eliminr() throws IOException{
       try{
           
           File eliminar = new File("Datos.txt");
           if(!eliminar.exists()){   
           }else{
               eliminar.delete();
               System.out.println("Arcivo eliminado con exito");
           }
        }catch(Exception e){}
   }
}
