/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package port.de.barcelona;
import java.util.ArrayList;

/**
 *
 * @author Roger Freixes
 * Classe Companyia té dos atributs
 * Nom i un ArrayList per guardar vaixells
 */
public class Companyia {
    private String nom;
    private ArrayList<Vaixell> vaixells = new ArrayList<Vaixell>();

    //Constructor un atribut nom que inicia
    public Companyia(String nom) {
        this.nom = nom;
    }

    //dos atirbut poden rebre (get) i no posar (set)
    public String getNom() {
        return nom;
    }

    public ArrayList<Vaixell> getVaixells() {
        return vaixells;
    }
    
    //Per poder afegir un vaixell al atribut vaixells de la companyia, si no troba el mateix que té al atribut vaixells (ArrayList) que ha de rebre el nom de vaixell
    public void afegirVaixell(){
        //vaixells.add(vai);
    }
    
    //Per poder eliminar un vaixell al atribut si té el mateix nom a dins atribut vaixells (ArrayList) que ha de rebre el nom de vaixell
    public void eliminarVaixell(){
        //vaixells.remove(vai);
    }
}
