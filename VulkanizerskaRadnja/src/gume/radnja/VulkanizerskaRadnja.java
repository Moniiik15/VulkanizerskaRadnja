package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/**
 * Klasa koja predstavlja vulkanizersku radnju
 * @author Monika Milenkovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista AutoGuma pod nazivom gume
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
		/**
		 * Metoda koja dodaje gumu u listu gume
		 * @param a je instanca klase AutoGuma
		 * @throws java.lang.NullPointerException ako je 
		 * unet
		 * <ul> 
		 * 
		 * <li>null</li>
		 * </ul>
		 * @throws java.lang.RuntimeException ako je
		 * uneta
		 * *<ul> 
		 * 
		 * <li>guma koja vec postoji u listi gume</li>
		 * </ul>
		 * 
		 */
		public void dodajGumu(AutoGuma a) {
			if (a == null)
				throw new NullPointerException("Guma ne sme biti null");
			if (gume.contains(a))
				throw new RuntimeException("Guma vec postoji");
			gume.addFirst(a);
		}
		/**
		 * Metoda koja trazi odredjenu gumu po Stringu markaModel iz liste AutoGuma pod nazivom gume
		 * @param markaModel nova vrednost za marku i model, sluzi da nadjemo gumu koja ima isti atribut markaModel 
		 * @param novaLista lista koja treba da sadrzi sve AutoGume iz liste gume u kojima se poklapa markaModel sa markaModel atributom iz liste gume za svaku AutoGumu
		 * @return null ako je
		 * <ul>
		 * <li>uneti atribut null</li>
		 * </ul>
		 * @return novaLista ako
		 * <ul>
		 * <li>uneti atribut nije null</li>
		 * </ul>
		 */
		public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
			if (markaModel == null)
				return null;
			LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			for(int i=0;i<gume.size();i++)
				if (gume.get(i).equals(markaModel))
					novaLista.add(gume.get(i));
			return novaLista;
			
		}
}