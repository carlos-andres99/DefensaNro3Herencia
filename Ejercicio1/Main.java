
package Ej1;



public class Main {


    public static void main(String[] args) {
        
        Celular a=new Celular();
        a.show();
        CelularNuevo b=new CelularNuevo();
        b.show();
        System.out.println(a.verify("A20", "Samsung"));
        a.showPrice();
        b.setPrecio(1000);
    }
    
}
