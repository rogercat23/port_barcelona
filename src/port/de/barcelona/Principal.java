/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package port.de.barcelona;

import java.util.Scanner;

/**
 *
 * @author Roger Freixes
 * Classe Principal
 * Es el classe on inicia al programa i mostra el menú d'opcions
 */
public class Principal {
    public static void main(String[] args) { //Inicia programa
        BaseDades bd = new BaseDades(); //Inicia base de dades
        int opc;//variable per poder escullir opció de menú i just do no sortira fins que hagi posat 0 que surt aplicació
        do{
            opc = menu();
            switch(opc){
                case 1:
                        mostrarcompanyies(bd);
                    break;
                case 2:
                        mostrarcompanyia(bd);
                    break;
                case 3:
                        afegircompanyia(bd);
                    break;
                case 4:
                        eliminarcompanyia(bd);
                    break;
                case 5:
                        mostrarvaixells(bd);
                    break;
                case 6:
                        mostrarvaixell(bd);
                    break;
                case 7:
                        afegirvaixell(bd);
                    break;
                case 8:
                        eliminarvaixell(bd);
                    break;
                case 0:
                        System.out.println("Acaba de sortir de l'aplicació.");
                    break;
                default:
                        System.out.println("ERROR: Acaba d'introduir un opció incorrecte!!");
                    break;
            }
        }while(opc!=0);
        bd.tancarBD();
    }
    
    public static int menu(){
        System.out.println("MENÚ D'OPCIONS");
        System.out.println("==============");
        System.out.println("1.-Veure companyies.");
        System.out.println("2.-Veure companyia.");
        System.out.println("3.-Afegir companyia.");
        System.out.println("4.-Eliminar companyia.");
        System.out.println("5.-Veure vaixells.");
        System.out.println("6.-Veure vaixell.");
        System.out.println("7.-Afegir vaixell.");
        System.out.println("8.-Eliminar vaixell.");
        System.out.println("0.- Sortir de l'aplicació.");
        System.out.println("Escull una opció:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void mostrarcompanyies(BaseDades bd) {
        System.out.println("LLISTA DE COMPANYIES");
        System.out.println("====================");
        bd.mostrartotescompanyies();
    }

    private static void mostrarcompanyia(BaseDades bd) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MOSTRAR UNA COMPANYIA (VAIXELLS)");
        System.out.println("===============================");
        System.out.println("Introdueix el nom de la companyia:");
        String nomc = sc.nextLine();
        
    }

    private static void afegircompanyia(BaseDades bd) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("AFEGIR UNA COMPANYIA");
        System.out.println("====================");
        System.out.println("Introdueix el nom de la companyia:");
        String nomc = sc.nextLine();
        
        Companyia companyia = new Companyia(nomc);
        bd.afegircompanyia(companyia);
    }

    private static void eliminarcompanyia(BaseDades bd) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ELIMINAR UNA COMPANYIA");
        System.out.println("====================");
        System.out.println("Introdueix el nom de la companyia:");
        String nomc = sc.nextLine();
        
    }

    private static void mostrarvaixells(BaseDades bd) {
        
    }

    private static void mostrarvaixell(BaseDades bd) {
        
    }

    private static void afegirvaixell(BaseDades bd) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("AFEGIR UN VAIXELL");
        System.out.println("====================");
        System.out.println("Introdueix el nom del vaixell:");
        String nomv = sc.nextLine();
        System.out.println("Introdueix el nom de la companyia que pertany:");
        String compv = sc.nextLine();
        System.out.println("Introdueix destinació:");
        String destv = sc.nextLine();
        System.out.println("Introdueix el numeró de passatgers del vaixell:");
        int npv = sc.nextInt();
        
    }

    private static void eliminarvaixell(BaseDades bd) {
        
    }
}
