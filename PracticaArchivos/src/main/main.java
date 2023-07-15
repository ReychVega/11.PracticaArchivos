package main;
import domain.Personas;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author reych
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       ArrayList<Personas> personas=new ArrayList<>();
        
        
        FileOutputStream fos=null;
        ObjectOutputStream salida=null;
        Personas p;
        
        try{
        //crear el archivo
        fos=new FileOutputStream("lista.ser");
        salida=new ObjectOutputStream(fos);
        
        //objeto
        p=new Personas("Reych", "11719",24);
        
        //enviar el objeto creado al fichero
        salida.writeObject(p);
        
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            fos.close();
        }

        FileInputStream fis=new FileInputStream("datos.ser");
     ObjectInputStream entrada=new ObjectInputStream(fis);
        try {
            while(true){
   
                p = (Personas) entrada.readObject();
                JOptionPane.showMessageDialog(null, "Id= " + p.getDni());
                JOptionPane.showMessageDialog(null, "Name= " + p.getNombre());
                JOptionPane.showMessageDialog(null, "Age= " + p.getEdad());

            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            entrada.close();
        }
        
        
    }
    
}
