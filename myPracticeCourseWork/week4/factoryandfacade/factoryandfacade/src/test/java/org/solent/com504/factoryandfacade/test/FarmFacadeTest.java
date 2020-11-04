package org.solent.com504.factoryandfacade.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.impl.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {
    @Test
    public void FarmFacadeTest() {
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        assertNotNull(farmFacade);
    }
    
    @Test
    public void testAddCat() {
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addCat("cat1");
        assertEquals(1, farmFacade.getAllAnimals().size());
        assertTrue(farmFacade.getAllAnimals().get(0) instanceof Cat);
    }
    
    @Test
    public void testAddCow() {
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addCow("cow1");
        assertEquals(1, farmFacade.getAllAnimals().size());
        assertTrue(farmFacade.getAllAnimals().get(0) instanceof Cow);
    }
    
    @Test
    public void testAddDog() {
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addDog("dog1");
        assertEquals(1, farmFacade.getAllAnimals().size());
        assertTrue(farmFacade.getAllAnimals().get(0) instanceof Dog);
    }
}
