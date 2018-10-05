/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author guille
 */
public class Constructores {

    String nombre1;
    String nombre2;
    String nombre3;
    
    public Constructores (){
        nombre1="Pablo";
        System.out.println(nombre1 + ", usted no tiene notas hasta el momento ");
    }
    
    public Constructores (int a){
        nombre2="Pedro";
        System.out.println(nombre2 + ", su nota es: ");
        System.out.println(a);
    }
    
    public Constructores (int a, int b){
        nombre3="Vilma";
        System.out.println(nombre3 + ", sus notas son: ");
        System.out.println(a+" y "+b);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Constructores Pablo = new Constructores ();
        Constructores Pedro = new Constructores (5);
        Constructores Vilma = new Constructores (4,6);
        
            
        }
        
    }
    
