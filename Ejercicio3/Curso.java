
package Ej3;

import java.util.Scanner;

public class Curso {
    
    static Scanner teclado=new Scanner(System.in);
            
    protected String nivel;
    protected int nroEstudiantes;
    protected String[] nomEst;
    protected String[] patEst;
    protected String[] matEst;
    protected int[] edades;
    
    //-->Getters & Setters

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getNroEstudiantes() {
        return nroEstudiantes;
    }

    public void setNroEstudiantes(int nroEstudiantes) {
        this.nroEstudiantes = nroEstudiantes;
    }

    public String[] getNomEst() {
        return nomEst;
    }

    public void setNomEst(String[] nomEst) {
        this.nomEst = nomEst;
    }

    public String[] getPatEst() {
        return patEst;
    }

    public void setPatEst(String[] patEst) {
        this.patEst = patEst;
    }

    public String[] getMatEst() {
        return matEst;
    }

    public void setMatEst(String[] matEst) {
        this.matEst = matEst;
    }

    public int[] getEdades() {
        return edades;
    }

    public void setEdades(int[] edades) {
        this.edades = edades;
    }
    
    //---> Contructors
    
    public Curso(String niv, int Nro ){
         nivel=niv;
         nroEstudiantes=Nro;
         nomEst=new String[nroEstudiantes];
         patEst=new String[nroEstudiantes];
         matEst=new String[nroEstudiantes];
         edades=new int[Nro];
         
         for(int i=0; i<nroEstudiantes ; i++){
             System.out.print("Int. nomb: ");
             nomEst[i]=teclado.next();
             System.out.print("Int. Ap. Paterno de "+nomEst[i]+": ");
             patEst[i]=teclado.next();
             System.out.print("Int. Ap. Materno de "+nomEst[i]+": ");
             matEst[i]=teclado.next();
             System.out.print("Int. Edad de "+nomEst[i]+": ");
             edades[i]=teclado.nextInt();        
         }
    }
    
    //--->Methods
    
    public void show(){
        for(int i=0; i<nroEstudiantes ;i++){
            System.out.print(nomEst[i]+" ");
            System.out.print(patEst[i]+" ");
            System.out.print(matEst[i]+" ");
            System.out.print(edades[i]+" ");
            System.out.println(" ");
        }
    }
}
