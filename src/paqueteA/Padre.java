package paqueteA;

public class Padre {
    private int edad = 12312;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    //otra cosa para que lo entiendas
    public Padre(){
        
    }
    
    public Padre(String a){
        setNombre(a);
    }
    
    public Padre(int a){
        setEdad(a);
    }
    
    
}
