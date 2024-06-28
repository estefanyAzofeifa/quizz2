/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Quizz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /*Cancion CancionNueva = new Cancion();  
    CancionNueva.getDuracion();*/
    
 Cancion cancion = new Cancion();
 String titulo = JOptionPane.showInputDialog("Digite el nombre de la cancion");
       cancion.setTitulo(titulo);
    
int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
       cancion.setId(id); 
       
String autor = JOptionPane.showInputDialog("Digite el nombre del autor");
       cancion.setAutor(autor);

int duracion = Integer.parseInt(JOptionPane.showInputDialog("Digite la duracion de la cancion"));
       cancion.setDuracion(duracion);
       
int anioCreacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de creacion de la cancion"));
       cancion.setAnioCreacion(anioCreacion);
      
JOptionPane.showMessageDialog( null,"Id de la cancion : " + cancion.getId());
JOptionPane.showMessageDialog( null,"titulo de la cancion :" + cancion.getTitulo());
JOptionPane.showMessageDialog( null,"nombre del autor : " + cancion.getAutor());
JOptionPane.showMessageDialog( null,"duracion de la cancion :" + cancion.getDuracion());
JOptionPane.showMessageDialog(null,"anio que se creo la cancion: " + cancion.getAnioCreacion());

}
    
    
   
     
        
        
        
    }
    

