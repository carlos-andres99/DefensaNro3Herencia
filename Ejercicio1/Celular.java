
package Ej1;


public class Celular {
    
    
    protected String marca, modelo, color;
    protected int precio;
    
    //---->Getters & Setters
    
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {        
        this.precio = precio;
    }

    //---->Constructors
    public Celular() {
        marca="Samsung";
        modelo="A20";
        color="Azul";
        precio=2500;
    }
    public Celular(String marc, String mod, String col, int pre){
        marca=marc;
        modelo=mod;
        color=col;
        precio=pre;
    }
    
    //---->Methods
    
    public void show(){
        System.out.println("-----------------");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println("-----------------");
    }
    

    public boolean verify(String mod, String marc){
        if(marca==marc && modelo==mod){
            return true;
        }else{
            return false;
        } 
    }
    
    public void showPrice(){
        System.out.println("Precio: "+precio+" Bs");
    }
            
            
            
    
    
}
