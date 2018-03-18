package gume;
/**
 * Klasa koja predstavlja gume za automobile
 * @author Monika Milenkovic
 * @version 1.0
 *
 */
public class AutoGuma {
/**
 * Marka i model gume
 */
private String markaModel = null;
/**
 * Precnik gume
 */
private int precnik = 0;
/**
 * Sirina gume
 */
private int sirina = 0;
/**
 * Visina gume
 */
private int visina = 0;

	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Postavlja novu vrednost za markaModel
	 * 
	 * @param markaModel nova vrednost za marku i model
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * unet
	 *   <ul> 
	 * 
	 * <li>null String</li>
	 * 
	 * <li>markaModel ima manje od 3 karaktera</li>
	 * 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
/**
 * vraca vrednost atributa precnik
 * @return precnik kao int
 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja novu vrednost za precnik.
	 * 
	 * @param precnik nova vrednost za precnik autoGume
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * unet 
	 *   <ul> 
	 * 
	 * <li>precnik van intervala [13,22]</li>
	 * </ul>
	 * 
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
/**
* vraca vrednost atributa sirina
* @return sirina kao int
*/
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost za sirina.
	 * 
	 * @param sirina nova vrednost za sirinu autoGume
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta
	 * <ul> 
	 * 
	 * <li>sirina van intervala [135,355]</li>
	 * </ul>
	 * 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * vraca vrednost atributa visina
	 * @return visina kao int
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost za visinu.
	 * 
	 * @param visina nova vrednost za visinu autoGume
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta
	 * <ul> 
	 * 
	 * <li>visina van intervala [25,95]</li>
	 * </ul>
	 * 
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
		", sirina=" + sirina + ", visina=" + visina + "]";
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
		return false;
		} 
		else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
		return false;
		if (sirina != other.sirina)
		return false;
		if (visina != other.visina)
		return false;
		
		return true;
		
		}
	}

