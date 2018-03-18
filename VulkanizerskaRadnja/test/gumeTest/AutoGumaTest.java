
package gumeTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Monika Milenkovic 
 * @version 1.0
 *
 */
public class AutoGumaTest {

	private AutoGuma a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
		a =new AutoGuma();
	}

	
	@After
	public void tearDown() throws Exception {
		a =null;
	}

	
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("opel astra");
		
		assertEquals("opel astra", a.getMarkaModel());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOd3Karaktera() {
		a.setMarkaModel("oa");
		
	}

	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanIntervala1() {
		a.setPrecnik(10);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanIntervala2() {
		a.setPrecnik(33);
		
	}

	
	@Test
	public void testSetSirina() {
		a.setSirina(150);
		assertEquals(150, a.getSirina());
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetSirinaVanIntervala1() {
		a.setSirina(100);
		
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetSirinaVanIntervala2() {
		a.setSirina(450);
		
	}

	
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50,a.getVisina());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaVanIntervala1() {
		a.setVisina(10);
		
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaVanIntervala2() {
		a.setVisina(150);
		
	}
	
	
	@Test
	public void testToString() {
		a.setMarkaModel("opel astra");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(80);
		
		assertEquals("AutoGuma [markaModel=opel astra, precnik=15, sirina=150, visina=80]", a.toString());
	}
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("opel astra");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(80);
		AutoGuma a2=new AutoGuma();
		a2.setMarkaModel("bmw 321");
		a2.setPrecnik(15);
		a2.setSirina(150);
		a2.setVisina(80);
		assertFalse(a.equals(a2));
	
	}
	@Test
	public void testEqualsTrue() {
		a.setMarkaModel("bmw x2");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(80);
		AutoGuma a2=new AutoGuma();
		a2.setMarkaModel("bmw x2");
		a2.setPrecnik(15);
		a2.setSirina(150);
		a2.setVisina(80);
		assertTrue(a.equals(a2));
	
	}

}
