
package Ej1;



public class CelularDañado extends Celular{
    private String dueño, motivo;
    
    public CelularDañado(String marc, String mod, String col, int pre,String dueñ, String mot){
       super(marc, mod, col, pre);
       dueño=dueñ;
       motivo=mot;
    }
    
}
