/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package port.de.barcelona;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author Roger Freixes
 * Classe BaseDades
 * On conté tot els moviments que farem el base de dades amb Llibreria odb4c
 */
public class BaseDades {
   private ObjectContainer bd; //inicia objecte de bd
	
        // Es crear si no existeix el nom d'arxiu i si es el contrari es obre arxiu
	public BaseDades()
	{
            bd = Db4oEmbedded.openFile("vaixells");
	}
	
        // Es tanca base de dades (arxiu guardat i tancat)
	public void tancarBD()
	{
            bd.close();
	} 

        public void afegircompanyia(Companyia companyia) {
            bd.store(companyia);
        }

    void mostrartotescompanyies() {
        
    }
}
