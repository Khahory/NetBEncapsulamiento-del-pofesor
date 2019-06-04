
package paqueteB;
import paqueteA.Padre;

public class ClaseDelPadre {
    public static void main(String args[]){
        Padre obj1 = new Padre("Angel");
        Padre obj2 = new Padre(19);

        System.out.println(obj1.getNombre());
        System.out.println(obj2.getEdad());
    }
    
    
}
