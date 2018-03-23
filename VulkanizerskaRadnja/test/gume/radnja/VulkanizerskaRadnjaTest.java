package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v=new VulkanizerskaRadnja();
		a=new AutoGuma();
		a.setMarkaModel("Goodyear");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(80);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);
		LinkedList<AutoGuma> nova=v.pronadjiGumu("Goodyear");
		assertTrue(nova.contains(a));
	}
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);	
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuKojaJeVecUListi() {
		v.dodajGumu(a);
		v.dodajGumu(a);	
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testPronadjiGumuNull() {
		v.pronadjiGumu(null);
		
	}
	@Test 
	public void testPronadjiGumuKojaNePostojiUListi() {
		LinkedList<AutoGuma> nova=v.pronadjiGumu("Pirelli");
		assertEquals(0, nova.size());
			
	}
	@Test 
	public void testPronadjiGumuAkoIhImaViseAliSaRazlicitimDimenzijama() {
		v.dodajGumu(a);
		AutoGuma b=new AutoGuma();
		b.setMarkaModel("Goodyear");
		b.setPrecnik(20);
		a.setSirina(155);
		a.setVisina(90);
		v.dodajGumu(b);
		LinkedList<AutoGuma> nova=v.pronadjiGumu("Goodyear");
		assertEquals(2, nova.size());
			
	}
	@Test 
	public void testPronadjiGumu() {
		v.dodajGumu(a);
		LinkedList<AutoGuma> nova=v.pronadjiGumu("Goodyear");
		assertEquals(1, nova.size());
			
	}
	
	

}
