
package Ej2;


public class Planta {
    
    protected String nombre, tipo, habitat;
    protected int alturaProm;
    
    //---->Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitad() {
        return habitat;
    }

    public void setHabitad(String habitad) {
        this.habitat = habitad;
    }

    public int getAlturaProm() {
        return alturaProm;
    }

    public void setAlturaProm(int alturaProm) {
        this.alturaProm = alturaProm;
    }
    
    //----> Constructors
    
    
    public Planta(){
        nombre= "rosa";
        alturaProm= 1;
        tipo="domestica";
        habitat="clima húmedo";
    }
    
    public Planta(String n, int a, String t, String h){
        nombre=n;
        alturaProm=a;
        tipo=t;
        habitat=h;
        
    }
    
    //--->Methods
    
    public void show(){
        System.out.println("Nombre: "+nombre+" ");
        System.out.println("Altura: "+alturaProm+"[m]");
        System.out.println("Tipo: "+tipo+" ");
        System.out.println("Hábitat: "+habitat+" ");
        System.out.println("");
    }
    
    public void showHeight(Planta x){
        if(this.alturaProm>x.getAlturaProm()){
            System.out.println(this.nombre);
        }else{
            System.out.println(x.getNombre());
        }
    }
    
    public boolean verifyName(String nom){
        if(this.nombre.equals(nom) ){
            return true;
        }else{
            return false;
        }
    }
}
    