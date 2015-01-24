/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package port.de.barcelona;

/**
 *
 * @author Roger Freixes
 * Classe Vaixell té 4 atributs
 * Nom, companyia, destinació i numero de passatgers
 */
public class Vaixell {
    private String nom;
    private String companyia;
    private String destinacio;
    private int num_passatgers;

    // Constructor amb tots atributs per iniciar
    public Vaixell(String nom, String companyia, String destinacio, int num_passatgers) {
        this.nom = nom;
        this.companyia = companyia;
        this.destinacio = destinacio;
        this.num_passatgers = num_passatgers;
    }
    
    // Tots els atributs poden rebre (get) però no posar (set)
    public String getNom() {
        return nom;
    }

    public String getCompanyia() {
        return companyia;
    }

    public String getDestinacio() {
        return destinacio;
    }

    public int getNum_passatgers() {
        return num_passatgers;
    }

    //Funció toString que mostrarà dos atributs de classe (nom i companyia)
    public String toString() {
        return nom + " (" + companyia + ')';
    }
}
