
package Ej2;

public class Main {

  
    public static void main(String[] args) {
      ArbolMedicinal arbMed=new ArbolMedicinal("Eucalipto",70,"silvestre","climas frescos y húmedos");
      ArbolFrutal arbFrut=new ArbolFrutal("Mango",35,"silvestre","climas cálidos");
      arbMed.show();
      arbFrut.show(); 
      arbMed.showHeight(arbFrut);
      System.out.println(arbMed.verifyName("Eucalipto"));
      System.out.println(arbFrut.verifyName("Eucalipto"));
    }
    
}
